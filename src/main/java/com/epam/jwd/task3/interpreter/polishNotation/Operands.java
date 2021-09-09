package com.epam.jwd.task3.interpreter.polishNotation;

public enum Operands {
    DIVIDE("/", 2), MINUS("-", 1),
    MULTIPLY("*", 2), PLUS("+", 1),
    LEFT_BRACKET("(", 3), RIGHT_BRACKET(")", 3);

    private String operand;
    private int priority;


    Operands(String operand, int priority) {
        this.operand = operand;
        this.priority = priority;
    }

    public String getOperand() {
        return operand;
    }

    public int comparePriority(Operands operand) {
        return operand.priority - this.priority;
    }
}
