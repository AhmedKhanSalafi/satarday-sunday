package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Code6 {

    public static void main(String[] args) {
        //input mismatch exception

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter any value");
            int a = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("exception : enter only integer");
        }


    }
}
