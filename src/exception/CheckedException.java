package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
