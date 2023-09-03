package Review5;

public class ArrayReview1 {
    public static void main(String[] args) {
        int a = 10;
        int[] array = {10, 11, 12, 13, 55, 34, 24};
        int numberofelements = array.length;
        System.out.println(numberofelements);
        System.out.println(array[3]);

        //when to use loops-when we want to repeat a block of code
        // when we do not know the exact number of iterations (while or do while loop)
        //

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        //int []array={10,11,12,13,55,34,24};
        for (int b : array) {
            System.out.print(b + " ");
        }

        System.out.println();

    }

}
