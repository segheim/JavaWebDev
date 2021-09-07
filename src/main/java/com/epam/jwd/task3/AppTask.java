package com.epam.jwd.task3;

import com.epam.jwd.task3.parsers.ParserParagraph;
import com.epam.jwd.task3.reader.IReader;
import com.epam.jwd.task3.reader.ReaderFile;

public class AppTask {
    public static void main(String[] args) {
        IReader iReader = new ReaderFile();
        System.out.println(iReader.read());

//        Parsers parserparag = new ParserParagraph();
//        Parsers parserssentence = new ParserSentence();
//        Parsers parserLexeme = new ParserLexeme();
//
//        parserparag.setNextParser(parserssentence);
//        parserssentence.setNextParser(parserLexeme);
//
//        CompositeText cpText = new CompositeText();
//        cpText.addComponent(parserparag.parse());
    }
}
