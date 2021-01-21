package io;

import java.io.*;

public class WorkWithFile {
    public static void processingFiles(String str) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("/home/dev/Рабочий стол/FILE.txt");
        BufferedReader br = new BufferedReader(fr);

        String result = "";
        while (str != null) {
            result += "\n" + str;
            str = br.readLine();
        }
        FileWriter fw = new FileWriter("/home/dev/Рабочий стол/FILE.txt");
        fw.write(result);
        fw.close();
        fr.close();
        br.close();
    }

}


