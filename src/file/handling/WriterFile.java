package file.handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello java file handling");
            bw.newLine();
            bw.write("Learning java step by step.");
            bw.close();
            System.out.println("Data written successfully!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
