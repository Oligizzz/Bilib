package com.mailisu.server1.async.jdkobserver;

import java.util.EventObject;

/**
 * @author: chunzhao
 * @time: 2023/2/3
 */
public class MyEvent extends EventObject {

    private Long bizId;
    private Integer type;
    private String message;


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MyEvent(Object source, Long bizId, Integer type, String message) {
        super(source);
        this.bizId = bizId;
        this.type = type;
        this.message = message;
    }

    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
