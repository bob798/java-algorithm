package me.bob.java.algorithm.design.pattern.simple.factory;

public class PasswordLogin implements Login {
    @Override
    public boolean Login(String name, String password) {
        System.out.println("我是密码登录，验证成功");
        return true;
    }
}
