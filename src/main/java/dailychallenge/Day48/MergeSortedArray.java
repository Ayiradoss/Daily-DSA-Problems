package dailychallenge.Day48;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};

        int[] nums2 = {2,5,6};

        int m = 3;

        int n = 3;

        System.out.print(Arrays.toString(merge(nums1, m, nums2, n)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int mindex = m - 1;

        int nindex = n - 1;

        int rigth = m + n - 1;

        while(nindex >= 0)
        {
            if(mindex >= 0 && nums1[mindex] > nums2[nindex])
            {
                nums1[rigth] = nums1[mindex];

                mindex--;
            }
            else
            {
                nums1[rigth] = nums2[nindex];

                nindex--;
            }
            rigth--;
        }
        while(nindex >= 0)
        {
            nums1[rigth]=nums2[nindex];

            rigth--;

            nindex--;
        }
        return nums1;
    }
}
