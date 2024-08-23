package whileBlock;

import java.util.Scanner;

public class Code3 {

    public static void main(String[] args) {
        //display first digit of given number

        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n= sc.nextInt();
        while (n>=10){

            n=n/10;

        }
        System.out.println("first digit :"+n%10);
    }
}
