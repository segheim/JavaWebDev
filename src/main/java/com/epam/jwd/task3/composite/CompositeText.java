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
                components.forEach(component -> stringBuilder.append("\t").append(component.print()).append("\n"));
                break;
            case SENTENCE:
                components.forEach(component -> stringBuilder.append(component.print()).append(" "));
                break;
            case LEXEME:
                components.forEach(component -> stringBuilder.append(component.print()).append(" "));
                break;
            default:
                components.forEach(component -> stringBuilder.append(component.print()));
        }

        return stringBuilder.toString();
    }
}
