package file;

import java.io.File;

public class Code1 {

    public static void main(String[] args) {


        File file = new File("C:\\Users\\DELL\\Desktop\\file.txt");


        if (file.exists()) {

            System.out.println("file name "+file.getName());

            System.out.println("file path "+file.getAbsoluteFile());

            System.out.println(" file can read"+file.canRead());

            System.out.println("file can write "+file.canWrite());

            System.out.println("file lenth "+file.length());

        }else {

            System.out.println("file not found");
        }
    }
}