package util;

import io.Writer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.stream.Collectors.toList;

public class Util {
    public void createLetterList(String text) {
        ArrayList<String> letters;
        letters = Stream.of(text.split("[^а-яёА-ЯЁ]+"))
                .map(String::toUpperCase)
                .filter(e -> e.length() > 2)
                .collect(Collectors.toCollection(ArrayList::new));
        for (String letter : letters) {
            Writer.createNewFileAndRecordResult(letter);
            System.out.println(letter);
        }
    }

    public void displayingRows() {
        Path path = Paths.get("/home/dev/IdeaProjects/SimpleParser/src/main/java/resources/parse.txt");
        PrintWriter out = null;
        try {
            out = new PrintWriter(new File("/home/dev/IdeaProjects/SimpleParser/src/main/java/resources/result.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found " + e.getMessage());
        }
        Map<String, Integer> letterMap = new HashMap<>();

        Stream<String> lines = null;
        try {
            lines = Files.lines(path, UTF_8);
        } catch (IOException e) {
            System.out.println("Incorrect path " + e.getMessage());
        }
        ArrayList<String> file = new ArrayList<>(lines.collect(toList()));

        for (String word : file) {
            Integer oldCount = letterMap.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            letterMap.put(word, oldCount + 1);
        }
        for (Map.Entry entry : letterMap.entrySet()) {
            out.println(entry.getKey() + "\t - \t" + entry.getValue());
        }
    }
}
