package class5;

import java.util.Scanner;

public class AndTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your height in inches");
        int height = input.nextInt();
        if (height <= 60) {
            System.out.println("short");
        } else if (height > 60 && height <= 72){
            System.out.println("medium");
        }else {
            System.out.println("tall");

        }
}
}
