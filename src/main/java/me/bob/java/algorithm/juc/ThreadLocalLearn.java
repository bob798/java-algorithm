package me.bob.java.algorithm.juc;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalLearn {
    static java.lang.ThreadLocal<String> threadLocal = new java.lang.ThreadLocal<>();
    static java.lang.ThreadLocal<String> threadLocal2 = new java.lang.ThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("one");
        threadLocal.set("two");
        threadLocal2.set("2");

        System.out.println(threadLocal.get());
        System.out.println(threadLocal2.get());


    }
}
