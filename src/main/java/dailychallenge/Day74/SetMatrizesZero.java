package dailychallenge.Day74;

import static java.util.Arrays.deepToString;

public class SetMatrizesZero {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        System.out.print(deepToString(setZeroes(matrix)));
    }
    public static Object[] setZeroes(int[][] matrix) {

        int m = matrix.length;

        int n = matrix[0].length;

        boolean firstRowZero = false;

        boolean firstColZero = false;

        for(int i = 0; i < m; i++)
        {
            if(matrix[i][0] == 0)
            {
                firstRowZero = true;
            }
        }

        for(int j = 0; j < n; j++)
        {
            if(matrix[0][j] == 0)
            {
                firstColZero = true;
            }
        }

        for(int i = 1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;

                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < m; i++)
        {
            if(firstRowZero)
            {
                matrix[i][0] = 0;
            }
        }

        for(int j = 0; j < n; j++)
        {
            if(firstColZero)
            {
                matrix[0][j] = 0;
            }
        }
        System.out.print(matrix);
        return firstRowZero;
    }
}
