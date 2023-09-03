package Class7;

public class Task3Arrays {
    // add all numbers
    public static void main(String[] args) {
        int[] numbers = {20, 10, 50, 30, 40};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];  //pick the previous value of sum and add it to current value of array


        }

        System.out.println(sum);


        }
    }


