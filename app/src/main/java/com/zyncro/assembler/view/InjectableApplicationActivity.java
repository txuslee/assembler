package com.zyncro.assembler.view;

import android.support.v7.app.AppCompatActivity;

import com.zyncro.assembler.ZyncroApplication;
import com.zyncro.assembler.application.component.ApplicationComponent;
import com.zyncro.assembler.application.module.ActivityModule;
import com.zyncro.assembler.application.component.HasComponent;

import javax.inject.Inject;

public class InjectableApplicationActivity extends AppCompatActivity implements HasComponent<ApplicationComponent> {

    @Inject
    protected ZyncroApplication application;

    /**
     * Get the Main Application component for dependency injection.
     *
     * @return {@link com.zyncro.assembler.application.component.ApplicationComponent}
     */
    protected ApplicationComponent getApplicationComponent() {
        return ((ZyncroApplication) getApplication()).getApplicationComponent();
    }

    /**
     * Get an Activity module for dependency injection.
     *
     * @return {@link com.zyncro.assembler.application.module.ActivityModule}
     */
    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    protected void inject(final InjectableApplicationActivity activity) {
        this.getComponent().inject(activity);
    }

    @Override
    public ApplicationComponent getComponent() {
        return this.getApplicationComponent();
    }

}
