package class6;

import java.util.Scanner;

public class E10WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter The Starting Point");
        int start= scanner.nextInt();
        System.out.println("Please Enter The Ending Point");
        int end=scanner.nextInt();
        System.out.println("Please Enter the steps as well");
        int step=scanner.nextInt();
        while(start<=end){
            System.out.print(start+" ");
            start +=step;

        }

    }
}
