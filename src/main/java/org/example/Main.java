package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner; // necessary for reading input and output

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variables and types
        int claims = 12; //whole numbers
        double amount = 2450.75; //decimals
        boolean approved = false; //true of false
        char grade = 'A'; //a single character, single quotes
        String name = "Rivera"; //text, double quotes
        Scanner in = new Scanner(System.in);

        /*
        NOTES:
        Integer division drops the remainder, if either side if a double
        the output is a decimal

        Casting converts between types, (int) 3.99 casts the double to an int
        and gives 3 (this truncates, it does NOT round)
         */
/*
        System.out.println("Hello, Desmond");
        System.out.println("Miles driven: ");
            double miles = in.nextDouble();
        System.out.println("You drove " + miles + " miles");
*/
        /*
        NOTES:
        + adds numbers but concatenates when either side is a String
        Java evaluates these expressions from left to right
         */

        /*
        Homework #1
         */

        System.out.println("Please enter the amount of your insurance claim: ");
        double claimAmount = in.nextDouble();
        System.out.println("Please enter the amount of your deductible: ");
        double deductibleAmount = in.nextDouble();

        double payout = claimAmount - deductibleAmount;

        if (payout <= 0) {
            System.out.println("Your deductible of $" + deductibleAmount + " is greater than or equal to the claim amount $" + claimAmount);
            System.out.println("There is no payout.");
        } else {
            System.out.println("Your payout is: $" + payout);
        }


        System.out.println("Please enter the amount of miles being claimed for reimbursement: ");
        double milesDriven = in.nextDouble();
        System.out.println("Please enter the mileage rate in decimal form: ");
        double rate = in.nextDouble();

        double mileageReimbursement = milesDriven * rate;

        System.out.println("Your reimbursement is: $" + mileageReimbursement);

        System.out.println("Your reimbursement rounded to the nearest whole dollar is: $" + (int)(mileageReimbursement + 0.5));

        System.out.println(7 / 2);
        System.out.println(7 / 2.0);
        System.out.println((int) 3.99);
        System.out.println("1" + 2 + 3);
        System.out.println(1 + 2 + "3");
        System.out.println(10 % 3);
        System.out.println(-7 / 2);
    }
}