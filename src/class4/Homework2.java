package class4;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //You are DMV representative and you need to ask customer their age.
        // If they are 18 and older you will issue a driver license to them,
        // otherwise you will offer them to get a learners permit.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("You will get a driver licence");
        }else{
            System.out.println("Else you will get a learner permit");
        }
    }
}
