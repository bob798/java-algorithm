package me.bob.java.algorithm.design.pattern;

public class Singleton {

    private volatile static Singleton singleton ;


    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton =  new Singleton();
                }
            }
        }
        return singleton;
    }
}

// todo 静态内部类
/*参考：单例模式 https://juejin.im/post/6844903858276139021，多线程安全，懒加载，饿汉式，应用场景
volatile 关键字 ：https://www.cnblogs.com/dolphin0520/p/3920373.html 使用场景
* */
