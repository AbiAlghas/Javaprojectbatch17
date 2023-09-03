package Class8;

public class taskarray2 {
    //10,20,4,3,8,45,96
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 3, 8, 45, 96};
        int number = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                number++;

            }
        }
        System.out.println(number);
    }
}