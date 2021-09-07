import java.util.Scanner;

public class Solution02 {

public static void main(String[] args) {

    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution 2
     *  Copyright 2021 Alexys Veloz
     */
 /* Alright this one is also a bit simple, we just print out
 some type of input prompt to give us a string, and scan it in, using some type of
 function to count how many characters there were. In c there's strlen so I'm sure there's
 Something similar. then use a print statement that prints out '[string] has [x] characters'
 or something similar.
  */
    System.out.println("Yo bro! I'm a counting master! If you give me a string, I'll tell you how many characters it is!");
    Scanner input = new Scanner (System.in);
    String string =  input.nextLine();
    int length = string.length();
    System.out.printf("Alright, \"%s\" has %d characters dawg!", string, length);

}
}