package practice;

import java.util.Scanner;

public class Code14 {

    public static void main(String[] args) {
        // //swap two number without third number

        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two value");

        a= sc.nextInt();
        b= sc.nextInt();

        System.out.println("before swapping :"+a+" "+b);
        //a=10,b=20
        a=a+b; //30
         b=a-b; //10
        a=a-b;

        System.out.println("before swapping :"+a+" "+b);
    }
}
