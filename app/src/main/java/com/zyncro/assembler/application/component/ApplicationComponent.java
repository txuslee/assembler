package com.zyncro.assembler.application.component;

import com.zyncro.assembler.application.ApplicationProvider;
import com.zyncro.assembler.application.module.ApplicationModule;
import com.zyncro.assembler.view.InjectableApplicationActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent extends ApplicationProvider {
    void inject(InjectableApplicationActivity activity);
}
