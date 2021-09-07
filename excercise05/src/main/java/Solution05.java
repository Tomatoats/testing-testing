import java.util.Scanner;


public class Solution05 {

    public static void main(String[] args) {

        /*
         *  UCF COP3330 Fall 2021 Assignment 1 Solution 5
         *  Copyright 2021 Alexys Veloz
         */
 /* OKay so this would be easy but it's sliiiightly harder since I gotta take this as a string
 and then convert to int. anyway, I take an input by printing out a statement for a number and scanning it in
 take a second number from the user via a prompt and scan it in, and convert those strings to ints.
 in one print line and using newline (\n), I'm gonna do aritmetic using +,-,*,/.  and using the variables  to get the numbers in.
  */
        System.out.println("Hey Dawg! Can you give me a number?");
        Scanner input = new Scanner (System.in);
        String number1 =  input.nextLine();
        System.out.println("Can you give me another number?");
        String number2 =  input.nextLine();

        double n1 =Double.parseDouble(number1);
        double n2 =Double.parseDouble(number2);
        double sum = n1 + n2;
        double difference = n1 - n2;
        double product = n1 * n2;
        double quotient = n1 / n2;
        System.out.printf("Okay so:\n%.0f + %.0f = %.0f\n%.0f - %.0f = %.0f\n%.0f * %.0f = %.0f\n%.0f / %.0f = %.2f", n1, n2,sum, n1, n2,difference, n1, n2,product, n1, n2, quotient);

    }
}