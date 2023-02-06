package com.mailisu.Semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author: chunzhao
 * @time: 2023/2/1
 */
public class SemaphoreTest1 {

    static Semaphore semaphore = new Semaphore(1);

    public static class TestJob extends Thread {
        public TestJob(String name) {
            super(name);
        }

        @Override
        public void run() {
            Thread curThread = Thread.currentThread();

            boolean isAcquire = false;
            try {
                semaphore.acquire(1);
                isAcquire = true;
                System.out.println(curThread.getName() + "获取信号量！");
//                TimeUnit.SECONDS.sleep(1);
                System.out.println("当前可用信号量:" + semaphore.availablePermits());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (isAcquire) {
                    semaphore.release();
                }
            }
            System.out.println("当前可用信号量:" + semaphore.availablePermits());
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 19; i++) {
//            TestJob job = new TestJob("ThreadName" + i);
//            job.start();
//        }
//
        TestJob t1 = new TestJob("1");
        TestJob t2 = new TestJob("2");
        TestJob t3 = new TestJob("3");
        t1.start();
        TimeUnit.SECONDS.sleep(1);
        t2.start();
        TimeUnit.SECONDS.sleep(1);
        t3.start();
        t2.interrupt();
        t3.interrupt();

    }
}
