package com.mailisu.server1.async.jdkobserver;

/**
 * @author: chunzhao
 * @time: 2023/2/3
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("p1");
        Person p2 = new Person("p2");
        Person p3 = new Person("p3");

        Teacher t1 = new Teacher("t1");
        t1.addObserver(p1);
        t1.addObserver(p2);
        t1.addObserver(p3);
        t1.test();
    }
}
