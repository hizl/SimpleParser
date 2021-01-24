package io;

import util.Worker;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

/*import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;*/

public class Writer {

    public static void processingFiles(String str) throws FileNotFoundException, IOException {

        Path path = Paths.get("/home/dev/IdeaProjects/SimpleParser/src/main/java/resources/file.txt");
        File file = Path.of("/home/dev/IdeaProjects/SimpleParser/src/main/java/resources/", "file.txt").toFile();

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String result = "";
        while (str != null) {
            result += str + System.lineSeparator();
            str = bufferedReader.readLine();
        }

       // Worker.displayingRows(path);
        Path resultPath = Path.of("/home/dev/IdeaProjects/SimpleParser/src/main/java/resources/", "result.txt");





        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(result);
        fileWriter.close();
        fileReader.close();
        bufferedReader.close();
    }

}


