package com.epam.jwd.task3.parsers;

import com.epam.jwd.task3.composite.*;

import java.util.Arrays;
import java.util.List;

public class ParserWord implements Parsers{

    private static final String PARSE_WORDS_ON_SYMBOL = "(?=)";
    private static final int INDEX_OF_LETTER = 0;
    private Parsers nextParser;

    @Override
    public void setNextParser(Parsers parser) {
        nextParser = parser;
    }

    @Override
    public Component parse(String word) {

        List<String> letters = Arrays.asList(word.split(PARSE_WORDS_ON_SYMBOL));
        Component letterComponent = new CompositeText(TypeText.WORD);

        if (nextParser != null) {
            for (String letter : letters) {
                letterComponent.addComponent(nextParser.parse(letter));
            }
        } else for (String letter : letters) {
            letterComponent.addComponent(new Letter(letter.charAt(INDEX_OF_LETTER)));
        }

        return letterComponent;
    }
}
