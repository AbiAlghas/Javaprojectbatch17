package class4;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        //Write a program to ask user to enter numbers of worked years and annual salary.
        // If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
        // Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.

        Scanner scanner=new Scanner(System.in);
        System.out.println("How many years did you work ");
        double work=scanner.nextDouble();
        if(work>=5){
            System.out.println("You are eligible for the bonus");

        Scanner scanner1=new Scanner(System.in);
        System.out.println("What is your annual salary ");
            double salary = scanner.nextDouble();
            if(salary>50000){
                System.out.println("Your bonus will be 5000");
            }else{
                System.out.println("Your bonus will be 3000");
            }

    }else {
            System.out.println("No bonus this year");
        }
        }
}
