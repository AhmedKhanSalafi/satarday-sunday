package ifblock;

import java.util.Scanner;

public class Code3 {

    public static void main(String[] args) {
//200 rupee cash back if customer pay 50% amount of  bill
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any amount");
        double bill = sc.nextDouble();
        System.out.println("enter any amount");
        double amount = sc.nextDouble();
        System.out.println("enter any amount");
        double min=0.5*bill;
        int cashback =0;
        if (amount>=min){

            cashback = 200;
        }

        System.out.println(" thank you for payment :"+amount);
        System.out.println("cash back :"+cashback);
    }
}
