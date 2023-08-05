package class5;

import java.util.Scanner;

public class Switchtask5 {
    //Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
    //Please complete this assignment in 2 ways: using if statement and switch case.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number");
        int a = input.nextInt();
        System.out.println("please enter number");
        int b = input.nextInt();
        System.out.println("enter operator");
        char op = input.next().charAt(0);
        if (op == '+') {
            System.out.println(a + b);
        } else if (op == '-') {
            System.out.println(a - b);

        } else if (op == '*') {
            System.out.println(a * b);

        } else if (op == '/') {
            System.out.println(a / b);


            } else{
                System.out.println("wrong data");
            }

        }
    }