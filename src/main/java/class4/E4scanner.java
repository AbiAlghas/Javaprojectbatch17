package class4;

import java.util.Scanner;

public class E4scanner {
    public static void main(String[] args) {
        System.out.println("please Enter your name");
        // creating the object of the scanner class so that we can reuse the logic from
        // this class which is already written for us by java developers
        Scanner scanner=new Scanner(System.in);
        //taking an input from the user and storing in int a name variable
        String name=scanner.next();
        if(name.equals("Asghar")){
            System.out.println("java instructor");
        }else{
            System.out.println("i don't know you");
        }
       // System.out.println("Hello "+name);



    }
}
