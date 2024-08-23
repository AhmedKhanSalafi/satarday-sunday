package practice;

import java.util.Scanner;

public class Code15 {

    public static void main(String[] args) {
        //convert days to years,weeks and days

        int days,years,weeks;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter days");

        days = sc.nextInt();

      years=(days/365);
        weeks=(days%365)/7;
      days=days-((years*365)+(weeks*7));

     System.out.println(years+"  "+weeks+" "+days);
    }
}
