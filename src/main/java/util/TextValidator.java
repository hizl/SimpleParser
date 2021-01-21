package util;

import io.WorkWithFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextValidator {
    public static Object uniqueLetters(String letters) {
        HashSet<String> noDupSet = new HashSet();
        noDupSet.add(letters);
        return noDupSet;
    }


    public static void createLetterList(String text) throws IOException {
        int counter = 0;
        ArrayList<String> letters = Stream.of(text.split("[^а-яёА-ЯЁ]+"))
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));

        for (String letter : letters) {

            if (letter.length() > 1) {
                WorkWithFile.processingFiles(letter);
                System.out.println(letter);
            }
        }

    }

}
