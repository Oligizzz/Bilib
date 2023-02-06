package com.mailisu.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chunzhao
 * @time: 2023/1/31
 */
public class Subject1 implements Subject {

    private List<Observer> observerList = new ArrayList<>();


    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void deletedObserver(Observer observer) {

    }

    @Override
    public void notifyObserver(String message) {

        for (Observer o : observerList) {
            o.update(message);
        }
    }
}
