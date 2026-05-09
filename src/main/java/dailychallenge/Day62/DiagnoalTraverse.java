package dailychallenge.Day62;

import java.util.Arrays;

public class DiagnoalTraverse {
    public static void main(String[] args) {
        int[][] nums = {{3,2,5}, {5,4,2}, {6,3,8}};

        System.out.print(Arrays.toString(findDiagonalOrder(nums)));
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;

        int m = mat[0].length;

        int row = 0, col = 0, index = 0;

        boolean upward = true;

        int[] arr = new int[n*m];

        while(index < n*m)
        {
            arr[index++] = mat[row][col];

            if(upward)
            {
                if(col == m - 1)
                {
                    row++;
                    upward = false;
                }
                else if(row == 0)
                {
                    col++;
                    upward = false;
                }
                else
                {
                    row--;
                    col++;
                }
            }

            else
            {
                if(row == n - 1)
                {
                    col++;
                    upward = true;
                }
                else if(col == 0)
                {
                    row++;
                    upward = true;
                }
                else
                {
                    row++;
                    col--;
                }
            }
        }
        return arr;
    }
}