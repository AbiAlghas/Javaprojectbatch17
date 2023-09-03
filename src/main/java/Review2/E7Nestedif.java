package Review2;

public class E7Nestedif {
    public static void main(String[] args) {

        String day = "sunday";
        double accountBalance = 5000;
        if (day.equals("Saturday")) {

            if (accountBalance > 2000) {
                System.out.println("We can buy this");
            } else {
                System.out.println("Its too expensive");
            }

        } else if(day.equals("saturday")){
            System.out.println("Its saturday lets go for dinner");
        } else {
            System.out.println("Lets wait for sunday");
        }


    }

}
