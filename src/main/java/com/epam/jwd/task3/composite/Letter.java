package com.epam.jwd.task3.composite;

public class Letter implements Component{

    private Character letter;

    public Letter(Character letter) {
        this.letter = letter;
    }

    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String print() {
        return String.valueOf(letter);
    }
}
