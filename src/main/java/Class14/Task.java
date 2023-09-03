package Class14;

public class Task {
    int calculationSum(int[]array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }return sum;
    }
    public static void main(String[] args) {
            int [] myArray={2,2,5,4,5};
            Task obj=new Task();
            int sum=obj.calculationSum(myArray);
        System.out.println("Sum of array: " +sum);
        }

    }
