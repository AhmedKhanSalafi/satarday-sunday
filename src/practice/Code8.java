package practice;

import java.util.Scanner;

public class Code8 {

    public static void main(String[] args) {

        //last digit of given number

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any input");

        int n = sc.nextInt();
        int d =n%10;

        System.out.println("last digit of"+n+"is"+d);
    }
}
