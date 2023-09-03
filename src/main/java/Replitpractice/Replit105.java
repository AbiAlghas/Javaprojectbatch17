package Replitpractice;

import java.util.Scanner;

public class Replit105 {
    /*Write a program that will print out only vowels of that string
Sample input/outputs:
In: howdyho
oo
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please write word");
        String word=input.nextLine();

        String getvowels=word.replaceAll("[^AEIOUaeiou]","");
        System.out.println("vowels are "+getvowels);
    }
}
