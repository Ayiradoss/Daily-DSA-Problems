package dailychallenge.Day67;

import java.util.PriorityQueue;

public class KthLargestElementInanArray {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};

        int k = 4;

        System.out.print(findKthLargest(nums, k));
    }
    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b-a));

        int[] arr = new int[nums.length];

        for(int i : nums)
        {
            pq.offer(i);
        }

        int n = 0;

        while(n < k)
        {
            arr[n++] = pq.poll();
        }
        return arr[k-1];
    }
}
