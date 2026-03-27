package dailychallenge.Day34;

public class PowOfXandN {
    public static void main(String[] args) {
        double x = 2.10000;

        int n = 3;

        System.out.print(myPow(x, n));
    }
    public static double myPow(double x, int n) {
        long N = n;

        if(N<0)
        {
            N = -N;

            x = 1/x;
        }
        double res = 1.0;

        while(N>0)
        {
            if(N%2 !=0)
            {
                res *= x;
            }
            x*= x;

            N/=2;
        }
        return res;
    }
}
