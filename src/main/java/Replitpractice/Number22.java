package Replitpractice;

import java.util.Scanner;

public class Number22 {
    //rite a program to take user name, age and mobile number
    //First Output: "Enter your name"
    //Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
    //Third Output: "Enter your age"
    //**Example Output:**

    //Enter your name

    //Enter your mobile number

    //Enter your age
    //Your name is Weqas, your age is 45 and your mobile number is 123-456-7890

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Name");
        String first= scanner.next();
        System.out.println("Enter your mobile number");
        int mobilenum=scanner.nextInt();
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        System.out.println("your name is " + first + ", your age is " + age + " and your mobile number is " + mobilenum);
    }

}
