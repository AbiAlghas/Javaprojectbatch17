package Replitpractice;

import java.util.Scanner;

public class Replit104 {
    /*Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.
Input Example:
John
Jane
Jimmy
Expected Output:
**Joh**
**Jan**
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String []names=new String[5];
        System.out.println("please enter the name");
        for (int i = 0; i <names.length ; i++) {
       names[i]=scanner.nextLine();
       while(names[i].length()<3){
           System.out.println("Name must be 3 characters long.please enter again");
           names[i]=scanner.nextLine();

       }

        }
        System.out.println("First 3 characters of the name");
        for(String name:names){
            System.out.println(name.substring(0,3));
        }
    }
}
