package Class9;

public class E42DArray {
    public static void main(String[] args) {
        int[][] numbers={
                {10,20,30,40},
                {15,30,35,45},
                {16,20,32,22}};

        for (int row = 0; row <numbers.length ; row++) {
            for (int col = 0; col <numbers[row].length ; col++) {   //numbers[row]=>gives us the complete 1D array
                System.out.print(numbers[row][col]+" ");
                
            }
            System.out.println();

        }
    }
}
