package Review3;

import java.util.Scanner;

public class E4Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter thr name of thr Fruit");
        String fruit=scanner.nextLine();

        switch(fruit){
            case "Orange":
                System.out.println("It is usually Orange");
                break;
            case "Banana":
                System.out.println("Yellow Bananas are good");
                break;
            case "Strawberry":
                System.out.println("I like Red Strawberries");
                break;
            case "Blue berry":
                System.out.println("Blue berries are very good for heart");
                break;
            default:
                System.out.println("I don't like this fruit");
                break;


        }
    }
}
