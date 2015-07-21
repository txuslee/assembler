package com.zyncro.assembler.domain;

public interface Assembler<S, D> {
    D assemble(S source) throws Exception;
}