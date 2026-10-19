package com.pluralsight;
import java.util.Scanner;

public class PayrollHelp {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String name = getName(input);

        double hours = getHours(input);
        double pay = getPay(input);

        double total = hours * pay;

        System.out.printf("%s, your gross pay is %.2f", name, total);

        //Exercise 5

       // Scanner myScanner = new Scanner(System.in);

       // System.out.println("Enter your name: \n");
       // String name = myScanner.nextLine();

       // System.out.println("Enter your hours worked (to the decimal: \n");
       // float hours = myScanner.nextFloat();

       // System.out.println("Enter your pay rate (to the decimal: \n");
       // float pay = myScanner.nextFloat();

       // float gross_pay = hours * pay;

       // System.out.printf("%s, you will make %.2f this week", name, gross_pay);


    }

    public static String getName(Scanner input) {
        System.out.println("What's your name?: ");
        String name = input.nextLine();
        return name;

    }

    public static double getHours(Scanner input) {
        System.out.println("Enter your hours worked: ");
        double hours = input.nextDouble();
        return hours;

    }

    public static double getPay(Scanner input) {
        System.out.println("Enter your par rate: ");
        double pay = input.nextDouble();
        return pay;


    }












}
