package com.mailisu.server1.async.jdkobserver;

import java.util.Observable;

/**
 * @author: chunzhao
 * @time: 2023/2/3
 */
public class Teacher extends Observable {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void test() {
        setChanged();
        notifyObservers("考试");
    }
}
