package io;

import java.io.*;
import java.nio.file.Path;

public class CreatingFile {
    public static void processingFiles(String str) throws FileNotFoundException, IOException {
        File file = Path.of("/home/dev/IdeaProjects/SimpleParser/src/main/java/resources/", "file.txt").toFile();
        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String result = "";
        while (str != null) {
            result += str + System.lineSeparator();
            str = bufferedReader.readLine();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(result);
        fileWriter.close();
        fileReader.close();
        bufferedReader.close();
    }

}


