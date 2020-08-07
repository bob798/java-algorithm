package me.bob.java.algorithm.design.pattern.simple.factory;

public class TokenLogin implements Login {
    @Override
    public boolean Login(String name, String password) {
        System.out.printf("我是令牌登录，登录成功");
        return true;
    }
}
