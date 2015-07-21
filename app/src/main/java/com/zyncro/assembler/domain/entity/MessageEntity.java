package com.zyncro.assembler.domain.entity;

import java.util.Date;

import io.realm.RealmObject;

public class MessageEntity extends RealmObject {

    private String id;
    private String message;
    private Date timeStamp;

    public MessageEntity() {
    }

    public MessageEntity(final String id, final String message, final Date timeStamp) {
        this.id = id;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

}
