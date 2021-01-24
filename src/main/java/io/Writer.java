package io;

import java.io.*;

public class Writer {
    public static void createNewFileAndRecordResult(String str) {
        File file = new File("/home/dev/IdeaProjects/SimpleParser/src/main/java/resources/parse.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Incorrect create file path " + e.getMessage());
        }
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("file is not exist " + e.getMessage());
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String result = "";
        while (str != null) {
            result += str + System.lineSeparator();
            try {
                str = bufferedReader.readLine();
            } catch (IOException e) {
                System.out.println("file is not exist " + e.getMessage());
            }
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(result);
            fileWriter.close();
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("file is not exist " + e.getMessage());
            e.printStackTrace();
        }

    }
}


