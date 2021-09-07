import java.util.Scanner;

public class Solution04 {

    public static void main(String[] args) {

        /*
         *  UCF COP3330 Fall 2021 Assignment 1 Solution 4
         *  Copyright 2021 Alexys Veloz
         */
 /* Alright so I'm gonna print an input to  tell the user to give us a noun, and scan in the noun,
 I'll do the same thing to get us a verb, adjective, and adverb, making the variables those names respectively.
 Then using printf, I'm going to essentially  do "Did you %s your %s %s %s, that's hilarious!" where I use the
 names of the variables to create this.
  */
        System.out.println("We're playing a game of mad libs! Gimme a noun!");
        Scanner input = new Scanner (System.in);
        String noun =  input.nextLine();
        System.out.println("Thanks dawg, now can you gimme a verb?");
        String verb =  input.nextLine();
        System.out.println("Ok homeslice, next I need an adjective.");
        String adjective =  input.nextLine();
        System.out.println("Last but not least my homeskillet, can ya give me an  adverb?");
        String adverb =  input.nextLine();
        System.out.printf("Woah! You %s your %s %s, %s? I've never seen that before!", noun, adjective, verb, adverb);

    }
}