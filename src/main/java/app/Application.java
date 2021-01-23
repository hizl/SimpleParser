package app;

import io.URLReader;

import java.io.IOException;


class Application {
    public static void main(String[] args) throws IOException {
        URLReader URLReader = new URLReader();
        URLReader.getConnection();
    }
}