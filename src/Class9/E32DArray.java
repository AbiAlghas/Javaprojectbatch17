package Class9;

import java.util.Arrays;

public class E32DArray {
    public static void main(String[] args) {
       /* int[] row0={10,20,30,40};
        int[] row1={100,200,300,400};
        int[] row2={1,2,3,4};*/

        int[][] numbers={
                {10,20,30,40},
                {100,200,300,400},
                {1,2,3,4}};
                int[] row=numbers[0];  // this return us a complete 1D array
                int number=numbers[0][1];  // this return us one single element
        System.out.println(numbers[2][1]);   //
        System.out.println(Arrays.toString(numbers[1]));   //complete second row




    }
}
