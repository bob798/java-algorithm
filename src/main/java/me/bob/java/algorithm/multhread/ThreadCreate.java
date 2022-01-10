package me.bob.java.algorithm.multhread;

public class ThreadCreate  {

    public static void main(String[] args) {
        new MyThread().start();

    }
    public static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("i'm first");
            super.run();
        }
    }
}
