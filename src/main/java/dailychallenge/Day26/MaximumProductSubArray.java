package dailychallenge.Day26;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};

        System.out.print(maxProduct(nums));
    }
    public static int maxProduct(int[] nums)
    {
        int maxending = nums[0];

        int minending = nums[0];

        int maxsofar = nums[0];

        if(nums.length == 1)
        {
            return nums[0];
        }

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] < 0)
            {
                int temp = maxending;

                maxending = minending;

                minending = temp;
            }
            maxending = Math.max(nums[i], maxending * nums[i]);

            minending = Math.min(nums[i], minending * nums[i]);

            maxsofar = Math.max(maxending, maxsofar);
        }
        return maxsofar;
    }
}
//irm https://claude.ai/install.ps1 | iex