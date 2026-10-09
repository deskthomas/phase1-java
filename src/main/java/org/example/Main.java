package org.example;
import java.util.Scanner; // necessary for reading input and output

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variables and types
        int claims = 12; //whole numbers
        double amount = 2450.75; //decimals
        boolean approved =  false; //true of false
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

        System.out.println("Hello, Desmond");
        System.out.println("Miles driven: ");
            double miles = in.nextDouble();
        System.out.println("You drove " + miles + " miles");

        /*
        NOTES:
        + adds numbers but concatenates when either side is a String
        Java evaluates these expressions from left to right
         */
    }
}