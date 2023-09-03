package Replitpractice;

import java.util.Scanner;

public class Replit101 {
    /*Inputs:
String word;
Write a for loop that will print out every other letter in a String,
starting with the first letter.  These letters should be printed all on one line with no space in between.
Sample input/outputs
In: hello
hlo
  */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=scanner.nextLine();
        for (int i =0; i <word.length() ; i+=2) {
            System.out.print(word.charAt(i));

        }


    }
}
