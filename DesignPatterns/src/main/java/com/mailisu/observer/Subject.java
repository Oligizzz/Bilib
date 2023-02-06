package com.mailisu.observer;

/**
 * @author: chunzhao
 * @time: 2023/1/30
 */
public interface Subject {

    /**
     * 添加订阅者
     *
     * @param observer
     */
    void addObserver(Observer observer);


    /**
     * 删除订阅者
     *
     * @param observer
     */
    void deletedObserver(Observer observer);

    /**
     * 通知观察者更新
     *
     * @param message
     */
    void notifyObserver(String message);
}
