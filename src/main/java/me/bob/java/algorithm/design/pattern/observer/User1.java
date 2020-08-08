package me.bob.java.algorithm.design.pattern.observer;

public class User1 implements Observer{


    @Override
    public void update(String msg) {
        System.out.println("user1 收到  "+msg);
    }
}

