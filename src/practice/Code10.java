package practice;

import java.util.Scanner;

public class Code10 {

    public static void main(String[] args) {

        //find the sum of first n natural number
        //formula n(n+1)/2

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any input");

        int n = sc.nextInt();
        int sum =  n*(n+1)/2;

        System.out.println("find the sum of first n natural number +"+n+"is"+sum);
    }
}
