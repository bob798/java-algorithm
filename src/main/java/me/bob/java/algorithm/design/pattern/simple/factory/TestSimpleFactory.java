package me.bob.java.algorithm.design.pattern.simple.factory;

public class TestSimpleFactory {
    public static void main(String[] args) {
        String type = "password";
        String name = "bob";
        String password = "bobpss";
        Login login = LoginFactory.getLogin(type);
        boolean success = login.Login(name, password);
        System.out.println("login result = "+success);
    }
}


/*
* 封装，继承，多态
* 实现松耦合，可扩展，便维护
* 简单工厂：
*  场景：创建对象少，客户端不关心对象创建过程
* */