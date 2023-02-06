package com.mailisu.server1.async.jdkobserver;

import java.util.EventListener;

/**
 * @author: chunzhao
 * @time: 2023/2/3
 */
public class MyListener implements EventListener {

    public void onMessage(String message) {
        System.out.println(message);
    }
}
