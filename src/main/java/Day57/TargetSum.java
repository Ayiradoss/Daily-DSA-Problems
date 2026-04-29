package dailychallenge.Day57;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};

        int target = 3;

        System.out.print(findTargetSumWays(nums, target));

    }
    public static int findTargetSumWays(int[] nums, int target) {

        int totalSum = 0;

        for(int num : nums)
        {
            totalSum += num;
        }

        if((target + totalSum) %2 != 0 || Math.abs(target) > totalSum)
        {
            return 0;
        }

        int subsetSum = (target + totalSum) / 2;

        int[] dp = new int[subsetSum + 1];

        dp[0] = 1;

        for(int num : nums)
        {
            for(int j = subsetSum; j >= num; j--)
            {
                dp[j] += dp[j - num];
            }
        }
        return dp[subsetSum];
    }
}
