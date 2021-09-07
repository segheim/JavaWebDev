package com.epam.jwd.task3.parsers;

import com.epam.jwd.task3.composite.Component;
import com.epam.jwd.task3.composite.Symbol;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserWord implements Parsers{

    private static final String PARSE_WORDS_ON_SYMBOL = ".";
    private Parsers nextParser;

    @Override
    public void setNextParser(Parsers parser) {
        nextParser = parser;
    }

    @Override
    public Component parse(String word) {

        Pattern pattern = Pattern.compile(PARSE_WORDS_ON_SYMBOL);
        Matcher matcher = pattern.matcher(word);
        Component comp = new Symbol('s');

        while (matcher.find()){
//            String s = matcher.group();
        }
//
//        if (nextParser != null) {
//            throw new UnsupportedOperationException("Symbol is smallest part of text");
//        } else Component symbol = new Symbol(symbols);
//        return sentenceComponent;

        return comp;
    }
}
