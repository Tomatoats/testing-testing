import java.util.Scanner;

public class Solution03 {

    public static void main(String[] args) {

        /*
         *  UCF COP3330 Fall 2021 Assignment 1 Solution 3
         *  Copyright 2021 Alexys Veloz
         */
 /* So similar to excercise 2, I'm gonna put an input that takes a quote from the user, in a form of a string
 then also ask them who said it, the author, and also make a variable for that. Then nNOT using printf [ :( ]
 i will add those two strings to roughly print out "[author] said [quote]
  */
        System.out.println("Heyo spaghettio! Gimme a quote, any quote! I'mma try using println this time");
        Scanner input = new Scanner (System.in);
        String quote =  input.nextLine();
        System.out.println("Ok homeslice, now who said the quote!");
        String author =  input.nextLine();
        System.out.println("So if I did this right, " + author +" said \"" + quote + "\"");

    }
}