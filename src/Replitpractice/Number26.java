package Replitpractice;

import java.util.Scanner;

public class Number26 {
    //he variable "name" holds a String user input
    //Write a conditional statement starting on line 9 that does the following:
    //- If name is equal to "Chen", print "teacher"
    //- For any other input, print "student"
    //Examples:
    //In: Chen
    //teacher
    //In: Faa
    //student

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("inp");
        String name=inp.next();
        if(name.equals("chen")){
        System.out.println("teacher");


    } else {
        System.out.println("student");
    }

    }
}
