package Review2;

import java.util.Scanner;

public class E8CommonScannerIssue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your FullName");
        String fName=scanner.next();
        System.out.println("Please Enter your city");
        scanner.nextLine();
        String city=scanner.nextLine();
        System.out.println(fName+" "+city);

    }
}
