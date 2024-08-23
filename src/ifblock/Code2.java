package ifblock;

import java.util.Scanner;

public class Code2 {

    public static void main(String[] args) {


        //20% bonus on salary if employees has more than 5 years years
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any amount");
        double salary = sc.nextDouble();
        System.out.println("enter any amount");
       int exp = sc.nextInt();

       if(exp>5){

        double bonus= 0.2*salary;
        salary=salary+bonus;
       }
        System.out.println(salary);

    }
}
