package Class11;

import java.util.Locale;
import java.util.Scanner;

public class Homework6 {
    //Write a program that reads two people's first
    //names and if they expecting boy or girl?
    //Based on the input suggests a name for a baby:
    //Example Output:
    //Mom’s first name? Mary
    //Dad’s first name? Daniel
    //Boy or Girl? boy
    //Suggested baby name: DANRY
    //
    //Example Output:
    //Mom’s first name? Mary
    //Dad’s first name? Daniel
    //Boy or Girl? girl
    //Suggested baby name: MAIEL
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mom’s first name");
        String Momsname=scanner.next();
        System.out.println("Dad’s first name");
        String Dadssname=scanner.next();
        System.out.println("Boy or girl");
        String gender=scanner.next();

        String momsBoy = Momsname.substring(Momsname.length()/2, Momsname.length()).toUpperCase();
        String momsGirl = Momsname.substring(0, Momsname.length()/2).toUpperCase(Locale.ROOT);
        String dadsBoy = Dadssname.substring(0,Dadssname.length()/2).toUpperCase();
        String dadsGirl = Dadssname.substring(Dadssname.length()/2, Dadssname.length()).toUpperCase();
        if(gender.equalsIgnoreCase("boy")){
            System.out.println(dadsBoy+momsBoy);
        } else if (gender.equalsIgnoreCase("girl")) {
            System.out.println(momsGirl+dadsGirl);

        }else {
            System.out.println("Invalid gender");
        }


    }
}





