package practice;

import java.util.Scanner;

public class Code9 {

    public static void main(String[] args) {

        // remove last digit of given number

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any input");

        int n = sc.nextInt();
        int r = n/10;

        System.out.println("remove last digit of given number:"+n+"is"+r);
    }
}