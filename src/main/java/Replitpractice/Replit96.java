package Replitpractice;

import java.util.Scanner;

public class Replit96 {
    /*You have Scanner class to input string value.
If language is Java it should print the:
"Java is a programming language".
If language is C it should print the:
"C is a procedural programming language"
If language is C++ it should print the:
"C++ is a middle-level programming language"
If any other should print:
"Doesn't match any programming language"
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your language");
        String language= scanner.nextLine();
        if(language.equals("java")){
            System.out.println("Java is a programming language");
        }else if(language.equals('c')){
        System.out.println("C is a procedural programming language");
        }else if(language.equals("c++")){
            System.out.println("c++ is a middle level programing language");
        }else{
            System.out.println("Doesn't match any programming language");
        }

        }

    }

