package com.pluralsight;
import java.util.Scanner;

public class PayrollHelp {

    public static void main(String[] args) {

        //Exercise 5

        //Step 1

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your name: \n");
        String name = myScanner.nextLine();

        System.out.println("Enter your hours worked (to the decimal: \n");
        float hours = myScanner.nextFloat();

        System.out.println("Enter your pay rate (to the decimal: \n");
        float pay = myScanner.nextFloat();

        float gross_pay = hours * pay;

        System.out.printf("%s, you will make %.2f this week", name, gross_pay);





    }
}
