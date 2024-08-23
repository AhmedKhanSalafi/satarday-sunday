package Array;

import java.util.Scanner;

public class Code8 {


        //find min and max value
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int numbers[] = new int[size];


            //input
            for(int i=0; i<size; i++) {
                numbers[i] = sc.nextInt();
            }


            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;

            for(int i=0; i<numbers.length; i++) {
                if(numbers[i] < max) {
                    max = numbers[i];
                }
                if(numbers[i] > min) {
                    min = numbers[i];
                }
            }


            System.out.println("Largest number is : " + max);
            System.out.println("Smallest number is : " + min);


        }
}
