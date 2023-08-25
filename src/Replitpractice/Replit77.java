package Replitpractice;

import java.util.Scanner;

public class Replit77 {
    //Create an array of integers that will store 5 elements taken from a user
    //Don't print any prompt message for the user
    //Then print out all the elements you have created in the first loop in reverse order.
    //Input:
    //1
    //2
    //3
    //4
    //5
    //Output:
    //5
    //4
    //3
    //2
    //1
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]value=new int[5];
        for (int i = 0; i < value.length ; i++) {
            value[i]=scanner.nextInt();
        }
        for (int i = value.length-1; i >=0 ; i--) {
            System.out.println(value[i]);
        }
    }
}
