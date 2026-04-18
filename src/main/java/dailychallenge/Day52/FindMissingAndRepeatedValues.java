package dailychallenge.Day52;

import java.util.Arrays;

public class FindMissingAndRepeatedValues {
    public static void main(String[] args) {
        int[][] nums = {{9,1,7},{8,9,2},{3,4,6}};

        System.out.print(Arrays.toString(findMissingAndRepeatedValues(nums)));
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        int size = n * n;

        int[] freq = new int[size + 1];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                freq[grid[i][j]]++;
            }
        }

        int missing = -1;

        int repeated = -1;

        for(int i = 1; i <= size; i++)
        {
            if(freq[i] == 0)
            {
                missing = i;
            }
            else if(freq[i] == 2)
            {
                repeated = i;
            }
        }
        return new int[]{repeated, missing};
    }
}
