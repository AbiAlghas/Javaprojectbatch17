package Class9;

public class E62DArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};
        for (int row = 0; row < numbers.length ; row++) {
            System.out.print(numbers[0][row]+" ");

            System.out.print(numbers[row][1]+" ");
            
        }
        System.out.println();
    }
}
