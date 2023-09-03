package Review2;

import java.util.Scanner;

public class E6IfIfDemo {
    public static void main(String[] args) {
    // only if condition will work but have to check all other options as well

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age to calculate your discount");
        int age=scanner.nextInt();
        if(age>60){
            System.out.println("You get 20% Discount");
        }if(age>50){
            System.out.println("You get 15% Discount");
        }if(age>40){
            System.out.println("You get 10% Discount");

        }else{
            System.out.println("NO Discounts");
        }
    }
}



