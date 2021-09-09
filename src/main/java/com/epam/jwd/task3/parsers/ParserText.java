package com.epam.jwd.task3.parsers;

import com.epam.jwd.task3.composite.Component;
import com.epam.jwd.task3.composite.CompositeText;
import com.epam.jwd.task3.composite.TypeText;

import java.util.Arrays;
import java.util.List;

public class ParserText implements Parsers{

    private static final String PARSE_TEXT_ON_PARAGRAPHS = "(?=\\t)";
    private Parsers nextParser;

    public void setNextParser(Parsers parser) {
        nextParser = parser;
    }

    @Override
    public Component parse(String text) {

        List<String> paragraphs = Arrays.asList(text.split(PARSE_TEXT_ON_PARAGRAPHS));
        Component paragraphComponent = new CompositeText(TypeText.TEXT);

        if (nextParser != null) {
            for (String paragraph : paragraphs) {
                if (!paragraph.isEmpty()) {
                    paragraphComponent.addComponent(nextParser.parse(paragraph.trim()));
                }
            }
        }
        return paragraphComponent;
    }
}