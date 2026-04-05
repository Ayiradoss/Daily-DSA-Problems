package dailychallenge.Day42;

public class FibannociNumber {
    public static void main(String[] args) {
        int n = 3;

        System.out.print(fib(n));
    }
    public static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }

        int[] newarr = new int[n+1];

        newarr[0] = 0;

        newarr[1] = 1;

        for(int i=2; i<=n; i++)
        {
            newarr[i] = newarr[i-2] + newarr[i-1];
        }
        return newarr[n];
    }
}
