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
* 编写流程：
*   场景：实现账号、密码或账号、口令等多种登录方式
* 步骤：
* 1. 定义登录接口，定义登录方法
* 2. 编写两个登录类，并实现登录接口
* 3. 定义登录工厂，通过switch、case语句匹配对应方式，并实例化登录类。
* 4. 调用处，通过实例工厂类来创建对应登录类
*
* 参考：https://www.cnblogs.com/java-my-life/archive/2012/03/22/2412308.html
* 工厂看这一篇就够了 https://juejin.im/entry/6844903474639929357
* */