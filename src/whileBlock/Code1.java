package whileBlock;

import java.util.Scanner;

public class Code1 {

    public static void main(String[] args) {

        //digit of number in reverse order

        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
       int n= sc.nextInt();

       while (n!=0){

           System.out.println(n%10);
           n=n/10;
       }
    }
}
