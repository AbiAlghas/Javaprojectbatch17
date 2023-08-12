package Class7;

public class ArraysHW7 {
    /*From an array of integer elements find the largest number.
    main
     */
    public static void main(String[] args) {
        int[] numbers = {100, 200,300, 150, 225};
        int largest= numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>largest){
                largest=numbers[i];

            }
        }
        System.out.println(largest);



    }
}
