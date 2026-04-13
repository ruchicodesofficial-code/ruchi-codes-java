package file.handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
//            FileReader fr = new FileReader("data.txt");
//            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
//            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
