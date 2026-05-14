package dailychallenge.Day64;

public class RemoveDuplicateFromTheSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,4,5,5};

        System.out.print(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;

        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
