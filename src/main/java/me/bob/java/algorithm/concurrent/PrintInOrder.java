package me.bob.java.algorithm.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 核心，线程间通信
 * 如何确保进程的执行顺序，可以采用信号量。我使用 synchronized, wait, notifyAll实现。
 */
public class PrintInOrder {

    AtomicInteger i = new AtomicInteger();
    final Object lock = new Object();


    public PrintInOrder() {
        i.set(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (lock) {
            while (i.get() != 0) {
                lock.wait();
            }
            printFirst.run();
            i.set(1);
            lock.notifyAll();
        }

        // printFirst.run() outputs "first". Do not change or remove this line.
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        synchronized (lock) {
            while (i.get() != 1) {
                lock.wait();
            }
            printSecond.run();
            i.set(2);
            lock.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {

        synchronized (lock) {
            while (i.get() != 2) {
                lock.wait();
            }
            printThird.run();
        }
    }
}
