package dailychallenge.Day53;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        System.out.print(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        boolean isDup = false;

        for(int i =0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                isDup = true;

                break;
            }
            map.put(nums[i], i);
        }
        return isDup;
    }
}
