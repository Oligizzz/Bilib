package com.mailisu.observer;

import java.util.concurrent.TimeUnit;

/**
 * @author: chunzhao
 * @time: 2023/1/30
 */
public class ConcreteObserver implements Observer {

    private String observerName;

    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(String message) {
        // 单个观察者阻塞
        if (observerName.equals("b")) {
            try {
                TimeUnit.SECONDS.sleep(5L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.observerName + "收到更新内容" + message);
    }
}
