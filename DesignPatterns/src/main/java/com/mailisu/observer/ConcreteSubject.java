package com.mailisu.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: chunzhao
 * @time: 2023/1/30
 */
public class ConcreteSubject implements Subject {

    List<Observer> observerList = new ArrayList<>();
    private static final ThreadPoolExecutor EXECUTOR = new ThreadPoolExecutor(200,
            500,
            10,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(200),
            new ThreadPoolExecutor.AbortPolicy());


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deletedObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer ob : observerList) {
//            ob.update(message);
            EXECUTOR.execute(() -> ob.update(message));
        }
    }
}
