package Class7;

public class ArraysHW4 {
    /*Create an array of cars and store 6 elements into it.
    Using 2 different loops print all values from the array.
    main
     */
    public static void main(String[] args) {
        String[] cars = {"Toyota", "honda", "accord", "nissan", "mazda", "audi"};
        int i = 0;
        while (i < cars.length) {
            System.out.println(cars[i]);
            i++;
        }
        String[] carss = {"Toyota", "honda", "accord", "nissan", "mazda", "audi"};
        for (int j = 0; j < carss.length; j++) {
            System.out.println(carss[j]);
        }
    }
}


