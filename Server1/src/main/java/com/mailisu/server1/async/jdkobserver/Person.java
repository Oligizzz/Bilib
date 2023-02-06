package com.mailisu.server1.async.jdkobserver;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

/**
 * @author: chunzhao
 * @time: 2023/2/3
 */
public class Person implements Observer {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(o.toString() + "通知" + this.name + arg.toString());
    }
}
