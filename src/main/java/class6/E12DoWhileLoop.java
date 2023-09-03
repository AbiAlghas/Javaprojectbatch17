package class6;

import java.util.Scanner;

public class E12DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input;

        System.out.println("Please enter a number and -1 to terminate");
        input= scanner.nextInt();
        System.out.println("you have entered "+input);
        if (input != -1) {
            do {
                System.out.println("Please enter a number and -1 to terminate");
                input = scanner.nextInt();
                System.out.println("you have entered " + input);
            } while (input != -1);
        }
    }
}
