package dailychallenge.Day60;

public class RotateDigits {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(rotatedDigits(n));
    }
    public static int rotatedDigits(int n) {
        int count = 0;

        for(int i = 1; i <= n; i++)
        {
            if(isValid(i))
            {
                count++;
            }
        }

        return count;
    }
    public static boolean isValid(int num)
    {
        boolean check = false;

        while(num > 0)
        {
            int digit = num % 10;

            if(digit == 4 || digit == 7 || digit == 3)
            {
                return false;
            }
            if(digit == 2 || digit == 5 || digit == 6 || digit == 9)
            {
                check = true;
            }
            num /= 10;
        }
        return check;
    }
}
