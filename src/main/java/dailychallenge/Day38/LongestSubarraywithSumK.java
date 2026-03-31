package dailychallenge.Day38;

import java.util.HashMap;

public class LongestSubarraywithSumK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, -10};

        int k = 15;

        System.out.print(longestSubarray(nums, k));
    }
    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        int maxLen = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];

            if(sum == k)
            {
                maxLen = i + 1;
            }

            if(map.containsKey(sum - k))
            {
                int len = i - map.get(sum - k);

                maxLen = Math.max(maxLen, len);
            }

            if(!map.containsKey(sum))
            {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
