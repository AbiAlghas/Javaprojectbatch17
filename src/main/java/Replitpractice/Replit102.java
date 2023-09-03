package Replitpractice;

import java.util.Scanner;

public class Replit102 {
    /* Write a for loop that will loop through every character of a word and print out each character, each on a separate line
 Sample inputs/outputs:
In: hello
h
e
l
l
o
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the word");
        String word=scanner.nextLine();
        for (int i = 0; i <word.length() ; i++) {
            System.out.println(word.charAt(i));
        }
    }
}
