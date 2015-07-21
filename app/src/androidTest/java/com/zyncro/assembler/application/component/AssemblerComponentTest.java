package com.zyncro.assembler.application.component;

import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import com.zyncro.assembler.application.module.AssemblerModule;
import com.zyncro.assembler.domain.entity.MessageEntity;
import com.zyncro.assembler.domain.impl.MessageEntityAssembler;
import com.zyncro.assembler.domain.model.MessageModel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Date;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(AndroidJUnit4.class)
public class AssemblerComponentTest extends AndroidTestCase {

    private AssemblerComponent sut;

    @Before
    public void setUp() throws Exception {
        this.sut = DaggerAssemblerComponent.builder()
                .assemblerModule(new AssemblerModule())
                .build();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void assembler_whenAssemblerModule_returnNonNullAssembler() {
        MessageEntityAssembler actual = this.sut.assembler();
        assertThat(actual).isNotNull();
    }

    @Test
    public void assembler_whenAssemblerModule_returnsAssembledModel() throws Exception{
        MessageEntityAssembler assembler = this.sut.assembler();
        final MessageModel expected = new MessageModel("id", "message", new Date());
        final MessageEntity actual = assembler.assemble(expected);

        assertThat(actual.getId()).isEqualTo(expected.getId());
        assertThat(actual.getMessage()).isEqualTo(expected.getMessage());
        assertThat(actual.getTimeStamp()).isEqualTo(expected.getTimeStamp());
    }
}