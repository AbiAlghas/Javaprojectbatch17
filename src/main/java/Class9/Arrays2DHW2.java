package Class9;

public class Arrays2DHW2 {
    //Create a 2D array or integer type and store numbers
    // in 3 rows and 4 columns. Print the sum of all numbers.
    public static void main(String[] args) {
        int[][] numbers = {
                {5, 10, 15,10},
                {25, 30, 35,21},
                {40, 45, 50,25}};
        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum=sum+numbers[row][col];

            }
        }
        System.out.println(sum);
    }
}


