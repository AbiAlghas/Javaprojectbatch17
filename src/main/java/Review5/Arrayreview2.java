package Review5;

public class Arrayreview2 {
    public static void main(String[] args) {
        double[] price={1.99,12.09,1,4.50};
        // index        [0]   [1]  [2] [3]
        for(double number:price){
            System.out.print(number+" ");

        }
        //regular for loop
        for (int i = 0; i < price.length; i++) {
            System.out.print(price[i]+" ");

        }
    }
}
