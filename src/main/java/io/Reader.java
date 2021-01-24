package io;

import util.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Reader {
    private Util UTIL = new Util();

    public void run() throws IOException {
        URL url = new URL("https://www.simbirsoft.com/");
        URLConnection getConnection = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(getConnection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            UTIL.createLetterList(inputLine);
        }
        in.close();
    }
}

