package Replitpractice;

import java.util.Scanner;

public class Replit95 {
    public static void main(String[] args) {
        //Using Scanner class input string value.
        //Print out the following: "The first 3 letters of \_\_\_ is ___"
        //For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word");
        String input= scanner.nextLine();
        String subinput=input.substring(0,3);
        System.out.println("The first 3 letters of the  "+subinput);

    }
}
