package class3;

public class E10ElseIfStatements {
    public static void main(String[] args) {
        String fruit="Kiwi";

        if (fruit.equals("Mango")){     //fruit=="Mango"
            System.out.println("price is 5$");
        } else if(fruit.equals("Oranges")) {
            System.out.println("price is 4$");

        }else if(fruit.equals("Apple")) {
            System.out.println("price is 1000$");
        }else if(fruit.equals("Kiwi")) {
            System.out.println("$6");
        }else{
            System.out.println("This Fruit is not available right now");

        }
    }
}
