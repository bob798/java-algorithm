package me.bob.java.algorithm.design.pattern.observer;

import java.util.List;

public interface Subject {
    void notify(List list);

    void add(Observer observer);

    void remober(Observer observer);
}
