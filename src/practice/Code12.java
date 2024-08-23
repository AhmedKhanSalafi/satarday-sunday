package practice;

import java.util.Scanner;

public class Code12 {

    public static void main(String[] args) {

        //find the third angle of triangle

        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any value");
        a= sc.nextInt();
        System.out.println("enter any value");
        b= sc.nextInt();

        c=180-(a+b);

        System.out.println("third angle is :"+c);

    }
}
