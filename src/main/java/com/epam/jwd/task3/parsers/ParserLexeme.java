package com.epam.jwd.task3.parsers;

import com.epam.jwd.task3.composite.Component;
import com.epam.jwd.task3.composite.CompositeText;
import com.epam.jwd.task3.composite.Symbol;
import com.epam.jwd.task3.composite.TypeText;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ParserLexeme implements Parsers {

    private static final String PARSE_LEXEMES_ON_WORDS = "(?=\\s|\\s-|\\.|^.|\\s|\\b)";
    private static final int INDEX_OF_SYMBOL = 0;
    private Parsers nextParser;

    @Override
    public void setNextParser(Parsers parser) {
        nextParser = parser;
    }

    @Override
    public Component parse(String lexeme) {

        List<String> words = Arrays.asList(lexeme.trim().split(PARSE_LEXEMES_ON_WORDS));
        Component wordComponent = new CompositeText(TypeText.LEXEME);

        if (nextParser != null) {
            for (String word : words) {
                if (Pattern.matches("([a-z]|[A-Z])+", word)) {
                    wordComponent.addComponent(nextParser.parse(word));
                }
                wordComponent.addComponent(new Symbol((word.trim().charAt(INDEX_OF_SYMBOL))));
            }
        }
        return wordComponent;
    }
}