package util;

import io.Writer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.stream.Collectors.toList;

public class Worker {
    public static void createLetterList(String text) throws IOException {
        ArrayList<String> letters;
        letters = Stream.of(text.split("[^а-яёА-ЯЁ]+"))
                .map(String::toUpperCase)
                .filter(e -> e.length() > 2)
                .collect(Collectors.toCollection(ArrayList::new));
        for (String letter : letters) {
            Writer.processingFiles(letter);
            System.out.println(letter);
        }
    }

    public static void displayingRows(Path path) throws IOException {
       // FileWriter writer = new FileWriter("notes3.txt", false);


        Stream<String> lines = Files.lines(path, UTF_8);
        ArrayList<String> file = new ArrayList<>(lines.collect(toList()));

        Map<String, Integer> letterMap = new HashMap<>();

        for (String word : file) {
            Integer oldCount = letterMap.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            letterMap.put(word, oldCount + 1);
        }
        int counter = 1;
        for (Map.Entry o : letterMap.entrySet()) {
            System.out.println(counter++ + ". " + o.getKey() + " - " + o.getValue());



        }
    }
}
