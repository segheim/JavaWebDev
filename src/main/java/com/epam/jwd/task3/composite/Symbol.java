package com.epam.jwd.task3.composite;

public class Symbol implements Component{

    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
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
        return String.valueOf(symbol);
    }
}
