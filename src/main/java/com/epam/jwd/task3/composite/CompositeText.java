package com.epam.jwd.task3.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeText implements Component{

    private TypeText type;
    private List<Component> components = new ArrayList<>();

    public CompositeText(TypeText type) {
        this.type = type;
    }

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public String print() {

        StringBuilder stringBuilder = new StringBuilder();

        switch (type) {

            case PARAGRAPH:
                for (Component component1 : components) {
                    stringBuilder.append("\t").append(component1.print()).append("\n");
//                    System.out.println(stringBuilder);
                }
                break;
            case SENTENCE:
                components.forEach(component -> stringBuilder.append(component.print()).append(" "));
                break;
            default:
                components.forEach(component -> stringBuilder.append(component.print()));
        }

        return stringBuilder.toString();
    }
}
