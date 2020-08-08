package me.bob.java.algorithm.design.pattern.observer;

public class User2 implements Observer{

    @Override
    public void update(String msg) {
        System.out.println("user2 收到  "+msg);
    }
}
