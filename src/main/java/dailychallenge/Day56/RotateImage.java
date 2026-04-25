package dailychallenge.Day56;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        System.out.print(Arrays.deepToString(rotate(matrix)));
    }
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i< n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];

                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++)
        {
            int left = 0;

            int rigth = n-1;

            while(left < rigth)
            {
                int temp = matrix[i][left];

                matrix[i][left] = matrix[i][rigth];

                matrix[i][rigth] = temp;

                left++;

                rigth--;
            }
        }
        return matrix;
    }
}