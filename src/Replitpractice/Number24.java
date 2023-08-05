package Replitpractice;

import java.util.Scanner;

public class Number24 {
    //Write a program that takes a user's name and prints it.
    //**Example Output:**
    //Hello, please enter your name
    //Your name is Sumair
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello,please enter your name");
        String name=scanner.nextLine();
        System.out.println("your name is "+name);

    }
}
