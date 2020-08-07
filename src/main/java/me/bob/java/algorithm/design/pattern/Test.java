package me.bob.java.algorithm.design.pattern;

public class Test {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.printf("we are same ");
        } else {
            System.out.printf("we not same");
        }
    }
}
