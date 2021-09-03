package com.epam.jwd.task3.composite;

public class Litter implements Component{
    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        System.out.println("litter");
    }
}
