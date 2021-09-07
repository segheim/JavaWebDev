package com.epam.jwd.task3.parsers;

import com.epam.jwd.task3.composite.Component;
import com.epam.jwd.task3.composite.CompositeText;
import com.epam.jwd.task3.composite.TypeText;

import java.util.Arrays;
import java.util.List;

public class ParserSentences implements Parsers {

    private static final String PARSE_SENTENCES_ON_LEXEMES = "\\s+(?=[\\w(])";
    private Parsers nextParser;

    @Override
    public void setNextParser(Parsers parser) {
        nextParser = parser;
    }

    @Override
    public Component parse(String sentence) {

        List<String> lexemes = Arrays.asList(sentence.trim().split(PARSE_SENTENCES_ON_LEXEMES));
        Component lexemeComponent = new CompositeText(TypeText.SENTENCE);

        if (nextParser != null) {
            for (String lexeme : lexemes) {
                lexemeComponent.addComponent(nextParser.parse(lexeme));
            }
        }
        return lexemeComponent;
    }
}
