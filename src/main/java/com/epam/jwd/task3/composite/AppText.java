package com.epam.jwd.task3.composite;

import com.epam.jwd.task3.parsers.*;
import com.epam.jwd.task3.reader.IReader;
import com.epam.jwd.task3.reader.ReaderFile;

public class AppText {
    public static void main(String[] args) {
        IReader iReader = new ReaderFile();


        ParserText parserText = new ParserText();
        ParserParagraph parserParagraph = new ParserParagraph();
        ParserSentences parserSentences = new ParserSentences();
        ParserLexeme parserLexeme = new ParserLexeme();
        ParserWord parserWord = new ParserWord();

        parserText.setNextParser(parserParagraph);
        parserParagraph.setNextParser(parserSentences);
        parserSentences.setNextParser(parserLexeme);
        parserLexeme.setNextParser(parserWord);
        System.out.println(parserText.parse(iReader.read()).print());


    }
}
