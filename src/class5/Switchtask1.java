package class5;

import java.util.Scanner;

public class Switchtask1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your country");
        String country=scanner.next();

        switch (country){
            case "canada":
                System.out.println("English or french");
                break;
            case "pakistan":
                System.out.println("Urdu");
                break;
            case "Dubai":
                System.out.println("arabic");
                break;
            case "India":
                System.out.println("urdu");
                break;
            case "spain":
                System.out.println("spainish");
                break;
            default:
                System.out.println("Language not spoken");
        }

    }
}
