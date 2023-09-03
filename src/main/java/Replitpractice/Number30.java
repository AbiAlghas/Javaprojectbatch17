package Replitpractice;

import java.util.Scanner;

public class Number30 {
    //Write a program to take the month number from a user.
    //Provide month name to the corresponding month number
    //If a user provides any number that is out of month range, the program should display "Invalid"
    //IMPORTANT: use Scanner Class
    //**Example Output:**
    //Please enter month number 1
    //January
    //**Example Output:**
    //Please enter month number 33
    //Invalid
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter month number");
        int monthNumber = scanner.nextInt();
        if (monthNumber == 1) {
            System.out.println("january");
        } else if (monthNumber == 2) {
            System.out.println("February");
        } else if (monthNumber == 3) {
            System.out.println("March");
        } else if (monthNumber == 4) {
            System.out.println("April");
        } else if (monthNumber == 5) {
            System.out.println("may");
        } else if (monthNumber == 6) {
            System.out.println("june");
        } else if (monthNumber == 7) {
            System.out.println("july");
        } else if (monthNumber == 8) {
            System.out.println("august");

            } else {
                System.out.println("invalid");
            }

        }
    }
