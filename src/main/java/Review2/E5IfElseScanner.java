package Review2;

import java.util.Scanner;

public class E5IfElseScanner {
    public static void main(String[] args) {

        /*
        if age is greater than 60 offer 20% discount
        if age is greater than 50 offer 15% discount
        if age is greater than 40 offer 10% discount
        No Discounts
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age to calculate your discount");
        int age=scanner.nextInt();
        if(age>60){
            System.out.println("You get 20% Discount");
        }else if(age>50){
            System.out.println("You get 15% Discount");
        }else if(age>40){
            System.out.println("You get 10% Discount");

            }else{
            System.out.println("NO Discounts");
        }
        }
    }

