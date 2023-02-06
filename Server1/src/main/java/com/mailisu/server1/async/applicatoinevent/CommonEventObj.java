package com.mailisu.server1.async.applicatoinevent;

import org.springframework.context.ApplicationEvent;

/**
 * @author: chunzhao
 * @time: 2023/2/3
 */

public class CommonEventObj extends ApplicationEvent {

    private Long bizId;
    private String bizMessage;

    public CommonEventObj(Object source, Long bizId, String bizMessage) {
        super(source);
        this.bizId = bizId;
        this.bizMessage = bizMessage;
    }

    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public String getBizMessage() {
        return bizMessage;
    }

    public void setBizMessage(String bizMessage) {
        this.bizMessage = bizMessage;
    }

    @Override
    public String toString() {
        return "CommonEventObj{" +
                "bizId=" + bizId +
                ", bizMessage='" + bizMessage + '\'' +
                ", source=" + source +
                '}';
    }
}
