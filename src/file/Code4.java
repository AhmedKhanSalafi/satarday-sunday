package file;

import java.io.File;

public class Code4 {

    public static void main(String[] args) {

//rename file
        File file = new File("C:\\Users\\DELL\\Desktop\\file.txt");

        File file2 = new File("C:\\Users\\DELL\\Desktop\\ahmed.txt");
        if (file.exists()) {

            System.out.println(file.renameTo(file2));

        }else {

            System.out.println("file not found");
        }
    }
}
