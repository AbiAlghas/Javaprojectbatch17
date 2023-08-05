package class5;

import java.util.Scanner;

public class Switchtask2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your grade");
        String grade=scanner.next();
        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not acceptable");
                break;
        }
    }
}
