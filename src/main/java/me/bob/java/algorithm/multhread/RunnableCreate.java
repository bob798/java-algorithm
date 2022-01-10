package me.bob.java.algorithm.multhread;

public class RunnableCreate {

    public static void main(String[] args) {
        new MyRunnable().run();
        new Thread(() -> {
            System.out.println("i'm runnable 简洁创建");
        }).start();
    }
    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("i'm runnable");
        }
    }
}
