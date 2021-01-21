package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Application {

    public static void main(String[] args) {
        new Application().exec();
    }

    public void exec() {
        BufferedReader reader = null;
        try {
            URL site = new URL("https://www.simbirsoft.com/");
            reader = new BufferedReader(new InputStreamReader(site.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {

                HashMap<Integer, String> map = new HashMap<Integer, String>();

                ArrayList<String> list = Stream.of(line.split("[^а-яёА-ЯЁ]+"))
                        .map(String::toUpperCase)
                        .collect(Collectors.toCollection(ArrayList::new));


                for (String o : list) {
                    System.out.println(o);
                }



         /*       Stream.of(line.split("[^а-яёА-ЯЁ]+"))
                        .map(String::toUpperCase)
                        .distinct().sorted()
                        .forEach(System.out::println);


*/

             /*   char[] c = line.toCharArray();
                for(char o : c){
                    if (Character.UnicodeBlock.of(o) == Character.UnicodeBlock.CYRILLIC) {
                        System.out.println(line);
                    }
                }*/


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