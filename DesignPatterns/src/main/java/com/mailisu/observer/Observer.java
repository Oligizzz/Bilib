package com.mailisu.observer;

/**
 * @author: chunzhao
 * @time: 2023/1/30
 */
public interface Observer {

    /**
     * 抽象观察者
     * @param message
     */
    void update(String message);
}
