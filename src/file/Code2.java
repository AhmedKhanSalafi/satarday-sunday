package file;

import java.io.FileWriter;
import java.io.IOException;

public class Code2 {

    public static void main(String[] args) {
//read file
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\DELL\\Desktop\\lc.txt");
       try {
           fileWriter.write("java is best language in this world ");
       }finally {
           fileWriter.close();
       }
            System.out.println("successfully data wrote in a file");

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
