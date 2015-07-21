package com.zyncro.assembler.domain.impl;

import com.zyncro.assembler.domain.Assembler;
import com.zyncro.assembler.domain.entity.MessageEntity;
import com.zyncro.assembler.domain.model.MessageModel;

import org.modelmapper.ModelMapper;

import javax.inject.Inject;

public class MessageEntityAssembler implements Assembler<MessageModel, MessageEntity> {

    protected final ModelMapper mapper;

    public MessageEntityAssembler() {
        this(new ModelMapper());
    }

    @Inject
    public MessageEntityAssembler(final ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public MessageEntity assemble(final MessageModel source) throws Exception {
        return this.mapper.map(source, MessageEntity.class);
    }

}
