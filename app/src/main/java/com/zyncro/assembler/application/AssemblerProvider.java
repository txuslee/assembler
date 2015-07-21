package com.zyncro.assembler.application;

import com.zyncro.assembler.domain.impl.MessageEntityAssembler;

import org.modelmapper.ModelMapper;

public interface AssemblerProvider {
    MessageEntityAssembler messageEntityAssembler(ModelMapper mapper);
}
