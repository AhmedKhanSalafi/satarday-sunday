package practice;

import java.util.Scanner;

public class Code13 {

    public static void main(String[] args) {

        //swap two number
        int a,b,temp;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter two value");

            a= sc.nextInt();
            b= sc.nextInt();

        System.out.println("before swapping :"+a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping :"+a+" "+b);
    }
}
