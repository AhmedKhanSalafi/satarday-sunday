package ifblock;

import java.util.Scanner;

public class Code1 {

    public static void main(String[] args) {



            //15% dis on bill if amount is greater than 5000
            Scanner sc = new Scanner(System.in);
            System.out.println("enter any amount");
            double bill = sc.nextDouble();

            if(bill>5000){
                double dis= 0.15*bill;
                bill=bill-dis;
            }
        System.out.println("total bill after discount :"+bill);
    }
}
