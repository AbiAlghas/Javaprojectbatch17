package class4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        //Create a Java program that will ask if user has a credit card or not.
        // If user does not have a credit card then offer them.
        // If they do have one ask what is balance on the card?
        // If balance of the card is larger than 1000, tell them to pay off immediately,
        // otherwise you can tell them that they can spend more.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String card=scanner.next();
        if(card.equals("Yes")){
            Scanner scanner1=new Scanner(System.in);
            System.out.println("What is the balance on the card");
            double balance=scanner.nextDouble();
            if(balance>1000){
                System.out.println("You must pay off immediately");}
            else{
                System.out.println("You may spend more");
            }} else{
            System.out.println("I would like to offer you new card");
        }

            }




}
