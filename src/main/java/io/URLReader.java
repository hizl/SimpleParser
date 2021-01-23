package io;

import util.WorkWithFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
    public void getConnection() throws IOException {
        URL url = new URL("https://www.simbirsoft.com/");
        URLConnection getConnection = url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(getConnection.getInputStream()));
        String inputLine;
        //get Connection And Record Letter
        while ((inputLine = in.readLine()) != null) {
            
            WorkWithFile.createLetterList(inputLine);
        }
        in.close();

    }


}

