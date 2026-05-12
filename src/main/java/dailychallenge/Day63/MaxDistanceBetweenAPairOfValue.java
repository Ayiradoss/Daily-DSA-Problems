package dailychallenge.Day63;

public class MaxDistanceBetweenAPairOfValue {
    public static void main(String[] args) {
        int[] nums1 = {55, 30, 5,4,2};

        int[] nums2 = {100, 20, 10, 10, 5};

        System.out.print(maxDistance(nums1, nums2));
    }
    public static int maxDistance(int[] nums1, int[] nums2)
    {
        int i = 0;

        int j = 0;

        int maxDist = 0;

        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] <= nums2[j])
            {
                maxDist = Math.max(maxDist, j - i);

                j++;
            }
            else
            {
                i++;
            }
        }
        return maxDist;
    }
}
