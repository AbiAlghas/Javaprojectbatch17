package class5;

import java.util.Scanner;

public class Switchtask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number");
        int a = input.nextInt();
        System.out.println("please enter number");
        int b = input.nextInt();
        System.out.println("enter operator");
        char op = input.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);

                break;
            case '*':
                System.out.println(a * b);

                break;
            case '/':
                System.out.println(a / b);


                break;
            default:
                System.out.println("wrong data");
                break;
        }

    }
}

