package com.epam.jwd.task3.reader;

import java.io.*;

public class ReaderFile implements IReader{

    private String fileName = "src/main/resources/text.txt";

    @Override
    public String read() {

        StringBuilder stringBuilder = new StringBuilder();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
                }
            } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }
}
