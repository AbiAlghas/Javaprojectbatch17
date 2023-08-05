package class5;

import java.util.Scanner;

public class ORTask {
    //Write a program for user to enter his/hers birth month. Based on the month define the season.
    //Example: if user is born in March, April, May → season =”Spring”
    //if user is born in June, July, August →
    //season =”Summer”  etc …
    //At the end of the program we should see 1 output as “You were born is season __”.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter his/her birth month");
        String month = input.nextLine();
        if (month.equals("march") || month.equals("april") || month.equals("may")) {
            System.out.println("your birth season is spring");
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            System.out.println("you were born in Summer");
        } else if (month.equals("september") || month.equals("october") || month.equals("november")) {
            System.out.println("your birth season is fall");
        } else if (month.equals("december") || month.equals("january") || month.equals("feburary")) {
            System.out.println("you were born in season winter");


        } else {
            System.out.println("wrong month");
        }

    }

}



