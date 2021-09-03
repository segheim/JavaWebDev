package com.epam.jwd.task3.composite;

public interface Component {

    void addComponent(Component component);
    void removeComponent(Component component);
    void print();
}
