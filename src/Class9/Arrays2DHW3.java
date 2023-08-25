package Class9;

public class Arrays2DHW3 {
    //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
    // Develop a program which will identify/print the even numbers only.
    public static void main(String[] args) {
        int[][] numbers={
                {20,30,40,50},
                {10,20,30,40},
                {15,25,35,40}};
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if(numbers[row][col]%2==0){
                    System.out.print(numbers[row][col]+" ");
                }

            }
            System.out.println();
        }
    }
}
