package Replitpractice;

public class Replit71 {
    //Write a program that creates an array of integers that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
    //Print only values that stored with even index including 0.
    //**Output:**
    //45 12 55 23 88
    public static void main(String[] args) {
        int[] number = {45,78, 12,  67, 55, 89, 23, 77, 88};
        for (int i = 0; i <= 8; i+=2) {
            System.out.print(number[i] + " ");

        }
    }

}
