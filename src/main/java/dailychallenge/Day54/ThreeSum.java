package dailychallenge.Day54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        System.out.print(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i<nums.length-2; i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int left = i+1;
            int rigth = nums.length-1;

            while(left < rigth)
            {
                int sum = nums[i] + nums[left] + nums[rigth];

                if(sum == 0)
                {
                    list.add(Arrays.asList(nums[i], nums[left], nums[rigth]));

                    while(left < rigth && nums[left] == nums[left + 1])
                    {
                        left++;
                    }

                    while(left < rigth && nums[rigth] == nums[rigth - 1])
                    {
                        rigth--;
                    }

                    left++;

                    rigth--;
                }
                else if(sum < 0)
                {
                    left++;
                }
                else
                {
                    rigth--;
                }
            }
        }
        return list;
    }
}
