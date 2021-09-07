import java.util.Scanner;

public class Solution01 {


    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution 1
     *  Copyright 2021 Alexys Veloz
     */

/* Aight so what we're gonna do for this excercise is
 We're gonna print a line that asks for the user's name and scan that in
 then using printf we're gonna print out a greeting using that string variable and %s to output it all in one line of code
 and uhhhhhh yeah thats about it for this one, not much else to do */

    public static void main(String[] args) {
        System.out.println("Yo yo my home skillet, what's ya name?");
        Scanner nametaker = new Scanner(System.in);
        String name = nametaker.nextLine();
        String output = "It's nice to finally know your name, " + name +"!";
        System.out.printf("%s", output);
    }
}
