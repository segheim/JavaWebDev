package com.epam.jwd.task3.parsers;

import com.epam.jwd.task3.composite.Component;

public interface Parsers {

    void setNextParser(Parsers parser);
    Component parse(String text);
}
