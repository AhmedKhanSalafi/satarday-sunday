package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Code5 {

    public static void main(String[] args) throws IOException {
        //copy data from one file to another

        FileInputStream r= new FileInputStream("C:\\Users\\DELL\\Desktop\\ahmed.txt");

        FileOutputStream w= new FileOutputStream("C:\\Users\\DELL\\Desktop\\file.txt");

        int i;
        while ((i=r.read())!=-1 ){

          w.write((char)i);
        }
        System.out.println("data copy seccussfully");
    }
}
