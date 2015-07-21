package com.zyncro.assembler.application.module;

import com.zyncro.assembler.application.AssemblerProvider;
import com.zyncro.assembler.domain.impl.MessageEntityAssembler;

import org.modelmapper.ModelMapper;

import dagger.Module;
import dagger.Provides;

@Module(includes = MapperModule.class)
public class AssemblerModule implements AssemblerProvider {

    @Override
    @Provides
    public MessageEntityAssembler messageEntityAssembler(ModelMapper mapper) {
        return new MessageEntityAssembler(mapper);
    }

}
