package dailychallenge.Day68;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementTwo {
    public static void main(String[] args) {
        int[] nums = {3,2,3};

        System.out.print(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();

        int throshold = nums.length / 3;

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int element = entry.getKey();

            int count = entry.getValue();

            if(count > throshold)
            {
                list.add(element);
            }
        }
        return list;
    }
}
