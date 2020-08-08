package me.bob.java.algorithm.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeChatPublicSubject implements Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void notify(List list) {
        for (Observer ob :
                observers) {
            ob.update("bob 公众号更新");
        }
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remober(Observer observer) {
        observers.remove(observer);
    }
}
