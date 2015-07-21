package com.zyncro.assembler;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.zyncro.assembler.application.component.ApplicationComponent;
import com.zyncro.assembler.application.component.DaggerApplicationComponent;
import com.zyncro.assembler.application.component.HasComponent;
import com.zyncro.assembler.application.module.ApplicationModule;

public class ZyncroApplication extends Application implements HasComponent<ApplicationComponent> {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initializeInjector(this);

        Stetho.initialize(Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                .build());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    private void initializeInjector(final ZyncroApplication application) {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(application))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }

    @Override
    public ApplicationComponent getComponent() {
        return this.applicationComponent;
    }
}
