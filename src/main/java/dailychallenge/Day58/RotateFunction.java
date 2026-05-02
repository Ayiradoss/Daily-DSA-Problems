package dailychallenge.Day58;

public class RotateFunction {
    public static void main(String[] args) {
        int[] nums = {4,3,2,6};

        System.out.print(maxRotateFunction(nums));
    }
    public static int maxRotateFunction(int[] nums) {
        int n = nums.length;

        int sum = 0;

        int func = 0;

        for(int i = 0; i < n; i++)
        {
            sum += nums[i];

            func += i * nums[i];
        }

        int max = func;

        int prev = func;

        for(int i = 1; i < n; i++)
        {
            int curr = prev + sum - n * nums[n - i];

            max = Math.max(max, curr);

            prev = curr;
        }
        return max;
    }
}
