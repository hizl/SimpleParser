package app;

import io.Reader;
import util.Util;

import java.io.IOException;

class Application {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        Util util = new Util();
        reader.run();
        util.displayingRows();
    }
}