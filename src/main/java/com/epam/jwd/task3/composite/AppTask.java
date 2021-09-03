package com.epam.jwd.task3.composite;

import com.epam.jwd.task3.reader.IReader;
import com.epam.jwd.task3.reader.ReaderFile;

public class AppTask {
    public static void main(String[] args) {
        IReader iReader = new ReaderFile();
        System.out.println(iReader.read());
    }
}
