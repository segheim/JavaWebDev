package com.epam.jwd.task3.reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppReader {
    public static void main(String[] args) {
        IReader iReader = new ReaderFile();
        System.out.println(iReader.read());

        Pattern pattern = Pattern.compile("\\w");
        Matcher matcher = pattern.matcher(iReader.read());
        List<Character> c = new ArrayList<>();

//        while (matcher.find()){
//            c.add(matcher.group().charAt(1));
//
//        }
//        System.out.println(c);
//
//        List<String> paragraphs = Arrays.asList(iReader.read().trim().split("\\s+(?=[\\w(~])"));
//
//        System.out.println(paragraphs);
//
//        String a = "a";
//        System.out.println(a.length());

    }
}
