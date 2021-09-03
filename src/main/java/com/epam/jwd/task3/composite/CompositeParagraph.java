package com.epam.jwd.task3.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeParagraph implements Component{

    List<Component> components = new ArrayList<>();

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println("paragraph");
        for (Component component : components) {
            component.print();
        }
    }
}
