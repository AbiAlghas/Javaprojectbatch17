package class4;

public class E3NestedIfElse {
    public static void main(String[] args) {

        double accountBalance=15000;
        if(accountBalance>28000){
            System.out.println("we can afford a normal toyota");

            if(accountBalance>50000){
                System.out.println("we can also afford Luxury cars as well");
            }

        } else{
            System.out.println("we need to save more");

        }
    }
}
