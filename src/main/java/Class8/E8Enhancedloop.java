package Class8;

public class E8Enhancedloop {
    public static void main(String[] args) {
        int[] nums = {10, 77, 25, 56, 60, 20};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 20) {
                nums[i] = 0;

            }
            System.out.println(nums[i]);
        }



    }
}
