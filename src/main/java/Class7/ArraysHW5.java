package Class7;

public class ArraysHW5 {
    /*Create an array of animals and store 5 elements into it.
     Using 2 different loops print all elements from the array.
     */
    public static void main(String[] args) {
        String[] animals = {"lamb", "goat", "cow", "buffalo", "moose"};
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + " ");
        }
        System.out.println();
        int j = 0;
        while (j < animals.length) {
            System.out.print(animals[j] + " ");
            j++;
        }

    }
}