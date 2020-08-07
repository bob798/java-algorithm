package me.bob.java.algorithm.design.pattern;

public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();

        if (singleton1 == singleton2) {
            System.out.printf("we are same ");
        } else {
            System.out.printf("we not same");
        }
    }
}
