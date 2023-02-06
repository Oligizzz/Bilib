package com.mailisu.observer;

/**
 * @author: chunzhao
 * @time: 2023/1/30
 */
public class ClientTest {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver("a");
        Observer observer2 = new ConcreteObserver("b");
        Observer observer3 = new ConcreteObserver("c");
        Observer observer4 = new ConcreteObserver("d");
        Subject subject = new ConcreteSubject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.addObserver(observer4);
        subject.notifyObserver("lalala");
        subject.deletedObserver(observer4);
    }
}
