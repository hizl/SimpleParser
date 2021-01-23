package util;

import io.CreatingFile;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Long.MAX_VALUE;

public class WorkWithFile {
    public static int uniqueLettersAndCounting() throws IOException {
        File file = new File("/home/dev/IdeaProjects/SimpleParser/src/main/java/resources/", "file.txt");
        int result = 0;
        FileReader input = new FileReader("/home/dev/IdeaProjects/SimpleParser/src/main/java/resources/file.txt");
        LineNumberReader count = new LineNumberReader(input);
        while (count.skip(MAX_VALUE) > 0) {
            result = count.getLineNumber() + 1;
        }
        return result;

    }


    public static void createLetterList(String text) throws IOException {
        ArrayList<String> letters;
        letters = Stream.of(text.split("[^а-яёА-ЯЁ]+"))
                .map(String::toUpperCase)
                .filter(e -> e.length() > 4)
                .collect(Collectors.toCollection(ArrayList::new));


        for (String letter : letters) {
            CreatingFile.processingFiles(letter + " - " +WorkWithFile.uniqueLettersAndCounting());
            System.out.println(letter + " - " + uniqueLettersAndCounting());
        }


    }
}
