package com.zyncro.assembler.application.module;

import android.content.Context;

import com.zyncro.assembler.ZyncroApplication;
import com.zyncro.assembler.application.ApplicationProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule implements ApplicationProvider {

    private final ZyncroApplication application;

    public ApplicationModule(final ZyncroApplication application) {
        this.application = application;
    }

    @Override
    @Provides
    @Singleton
    public ZyncroApplication application() {
        return this.application;
    }

    @Override
    @Provides
    @Singleton
    public Context context() {
        return this.application;
    }

}
