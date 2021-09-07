package com.epam.jwd.task3.parsers;

import com.epam.jwd.task3.composite.Component;
import com.epam.jwd.task3.composite.CompositeText;
import com.epam.jwd.task3.composite.TypeText;

import java.util.Arrays;
import java.util.List;

public class ParserParagraph implements Parsers{

    private static final String PARSE_PARAGRAPHS_ON_SENTENCES = "\\.{1,3}|!|\\?";
    private Parsers nextParser;

    public void setNextParser(Parsers parser) {
        nextParser = parser;
    }

    @Override
    public Component parse(String paragraph) {

        List<String> sentences = Arrays.asList(paragraph.split(PARSE_PARAGRAPHS_ON_SENTENCES));
        Component sentenceComponent = new CompositeText(TypeText.PARAGRAPH);

        if (nextParser != null) {
            for (String sentence : sentences) {
                sentenceComponent.addComponent(nextParser.parse(sentence));
            }
        }
        return sentenceComponent;
    }
}
