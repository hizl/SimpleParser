package io;

import util.TextValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ReaderIO {
    public void run() {
        BufferedReader reader = null;
        try {
            URL site = new URL("https://www.simbirsoft.com/");
            reader = new BufferedReader(new InputStreamReader(site.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                TextValidator.createLetterList(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("IO exception " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("IO exception " + e.getMessage());
            }
        }
    }

}
