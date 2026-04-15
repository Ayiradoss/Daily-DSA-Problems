package dailychallenge.Day50;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.print(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int prod1 = nums[n-1] * nums[n-2] * nums[n-3];

        int prod2 = nums[n-1] * nums[0] * nums[1];

        return Math.max(prod1, prod2);
    }
}
