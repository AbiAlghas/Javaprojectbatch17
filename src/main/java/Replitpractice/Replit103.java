package Replitpractice;

import java.util.Scanner;

public class Replit103 {
    /*Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.
Sample input/outputs:
In: hello
h e l l o

     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the word");
        String word=scanner.nextLine();
        for (int i = 0; i <word.length() ; i++) {
            System.out.print(word.charAt(i)+ " ");

        }
        System.out.println();
    }
}
