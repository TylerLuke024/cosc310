package review;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parsing {
    public static void main(String[] args) {
        File f = new File("palidromes.csv");
        try (Scanner in = new Scanner(f)) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
