package practice;

import java.util.Scanner;

public class Code11 {

    public static void main(String[] args) {
        //total salary of employee

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any basic");
        double basic = sc.nextDouble();
        double hra = 0.25*basic;
        double ta = 0.2*basic;
        double da = 0.15*basic;
double totalSalary = basic+hra+ta+da;
        System.out.println("total salary of employee:"+totalSalary);

    }
}