package Class12;

import java.util.Scanner;

public class E1Methods {
    public static void main(String[] args) {
        //we are creating the object of Scanner class
        //Scanner scanner=new Scanner(System.in);
        //using the scanner object we are calling the nextInt method.
        //scanner.nextInt();

        takeuserInput();
        System.out.println("Please enter the details again");
        takeuserInput();

    }
    static void takeuserInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name=scanner.nextLine();
        System.out.println("Please Enter Your age");
        int age=scanner.nextInt();
        System.out.println("Your name is "+name+" and you are "+age+" years old");
    }
}
