package com.zyncro.assembler.application.module;

import com.zyncro.assembler.application.MapperProvider;

import org.modelmapper.ModelMapper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MapperModule implements MapperProvider {

    @Override
    @Provides
    @Singleton
    public ModelMapper mapper() {
        return new ModelMapper();
    }

}
