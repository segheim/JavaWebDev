package com.epam.jwd.task3.interpreter.polishNotation;

import java.util.*;

public class PolishNotation {

    private static final String REGEX_DIGIT = "\\d";
    private static final String REGEX_OPERAND = "[*/+-]";

    public String createPolishNotation() {

        String date = "6/(5-3)*2*(2-1)";

        Deque<String> operators = new ArrayDeque<>();
        Deque<String> result = new ArrayDeque<>();

        List<String> symbols = Arrays.asList(date.split("(?=.)"));

        Map<String, Operands> operandsMap = new HashMap<>();
        operandsMap.put("+", Operands.PLUS);
        operandsMap.put("-", Operands.MINUS);
        operandsMap.put("*", Operands.MULTIPLY);
        operandsMap.put("/", Operands.DIVIDE);
        operandsMap.put("(", Operands.LEFT_BRACKET);
        operandsMap.put(")", Operands.RIGHT_BRACKET);

        for (String symbol : symbols) {
            if (isDigit(symbol)) {
                result.add(symbol);

            }
            if (isOperand(symbol)) {

                if (operators.isEmpty() || (operators.peek()).equals("(")) {
                    operators.push(symbol);
                } else if (operandsMap.get(operators.peek()).comparePriority(operandsMap.get(symbol)) > 0) {
                    operators.push(symbol);
                } else if (operandsMap.get(operators.peek()).comparePriority(operandsMap.get(symbol)) <= 0) {
                    while (!operators.isEmpty() && (!operators.peek().equals("(") ||
                            operandsMap.get(operators.peek()).comparePriority(operandsMap.get(symbol)) < 0)) {
                        result.add(operators.pop());
                    }
                        operators.push(symbol);
                }
            }

            if (symbol.equals("(")) {
                operators.push(symbol);
            }

            if (symbol.equals(")")) {
                while (!operators.peek().equals("(")) {
                    result.add(operators.pop());
                }
                operators.pop();
            }
        }
        while (!operators.isEmpty()) {
            result.add(operators.pop());
        }
        return result.toString();
    }

    private boolean isDigit(String str) {
        return str.matches(REGEX_DIGIT);
    }

    private boolean isOperand(String str) {
        return str.matches(REGEX_OPERAND);
    }
}
