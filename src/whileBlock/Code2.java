package whileBlock;

import java.util.Scanner;

public class Code2 {

    public static void main(String[] args) {
        //count digit in given number

        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n= sc.nextInt();
        int count=0;
        while (n!=0){

            n=n/10;
            count ++;
        }
        System.out.println(count);
    }
}
