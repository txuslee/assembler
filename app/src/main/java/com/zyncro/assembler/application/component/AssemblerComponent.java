package com.zyncro.assembler.application.component;

import com.zyncro.assembler.application.AssemblerProvider;
import com.zyncro.assembler.application.module.AssemblerModule;
import com.zyncro.assembler.domain.impl.MessageEntityAssembler;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AssemblerModule.class})
public interface AssemblerComponent {
    MessageEntityAssembler assembler();
}
