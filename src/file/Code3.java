package file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Code3 {

    public static void main(String[] args) {
//read file
        try {
          FileReader fileReader= new FileReader("C:\\Users\\DELL\\Desktop\\lc.txt");
            try {
                int i;
                while ((i=fileReader.read())!=-1 ){

                    System.out.println((char) i);
                }


                        } finally {
                            fileReader.close();
                        }
                        System.out.println("successfully data wrote in a file");

                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }}


