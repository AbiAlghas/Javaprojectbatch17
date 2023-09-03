package Class7;

public class E10Arrays {
    //creating the array and also initializing
    public static void main(String[] args) {
        String[] fruit = {"Apple", "Orange", "Banana", "Kiwi", "PinePpple"};

        fruit[4]="Mango";
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);

        }
    }
}