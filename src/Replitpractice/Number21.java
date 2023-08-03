package Replitpractice;

import java.util.Scanner;

public class Number21 {
    //rite a program that asks the user's age: "Enter your age  "
    //Then display it by adding 10 (i.e age + 10) in your final output.
    //**Example Output:**
    //Enter your age 30
    //Your age after 10 years is 40
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your age");
        int age=scanner.nextInt();
       int age1=age+10;

        System.out.println("your age after 10 years is "+age1);
    }
}
