package Array;

import java.util.Scanner;

public class Code10 {

    public static void main(String[] args) {

        //Check element is duplicate or not

        Scanner scan = new Scanner(System.in);
        int[] arr = {4, 2, 8, 1, 9, 6, 3, 7};
        System.out.println("enter element");
       int el = scan.nextInt();

       int count=0;

       for (int i=0;i< arr.length;i++) {
           if(arr[i]==el){
               count++;
           }

        }if(count==0){
            System.out.println("element not found");
        } else if (count==1) {
            System.out.println("element not duplicate");
        }else {
            System.out.println("duplicate element");
        }
    }
}
