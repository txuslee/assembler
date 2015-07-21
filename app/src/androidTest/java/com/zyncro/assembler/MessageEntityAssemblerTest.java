package com.zyncro.assembler;

import android.support.test.runner.AndroidJUnit4;

import com.zyncro.assembler.domain.entity.MessageEntity;
import com.zyncro.assembler.domain.model.MessageModel;
import com.zyncro.assembler.domain.impl.MessageEntityAssembler;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(AndroidJUnit4.class)
public class MessageEntityAssemblerTest extends TestCase {

    private MessageEntityAssembler sut;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        this.sut = new MessageEntityAssembler();
    }

    @After
    public void tearDown() throws Exception {

    }

    private MessageModel createMessageModel() {
        return new MessageModel("id", "message", new Date());
    }

    @Test
    public void assemble_whenMessageModel_returnsNotNullMessageEntity() throws Exception {
        final MessageModel expected = createMessageModel();
        final MessageEntity actual = this.sut.assemble(expected);
        assertThat(actual).isNotNull();
    }

    @Test
    public void assemble_whenMessageModel_returnsEqualMessageEntity() throws Exception {
        final MessageModel expected = createMessageModel();
        final MessageEntity actual = this.sut.assemble(expected);

        assertThat(actual.getId()).isEqualTo(expected.getId());
        assertThat(actual.getMessage()).isEqualTo(expected.getMessage());
        assertThat(actual.getTimeStamp()).isEqualTo(expected.getTimeStamp());
    }

}