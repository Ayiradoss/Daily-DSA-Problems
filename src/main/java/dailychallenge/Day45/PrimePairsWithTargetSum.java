package dailychallenge.Day45;

import java.util.ArrayList;
import java.util.List;

public class PrimePairsWithTargetSum {
    public static void main(String[] args) {
        int n = 10;

        System.out.print(findPrimePairs(n));
    }
    public static List<List<Integer>> findPrimePairs(int n)
    {
        List<List<Integer>> list1 = new ArrayList<>();

        int l = 2;

        int r = n-2;

        while(l<=r)
        {
            if(prime(l) && prime(r))
            {
                List<Integer> list2 = new ArrayList<>();

                list2.add(l);

                list2.add(r);

                list1.add(list2);
            }
            l++;

            r--;
        }
        return list1;
    }
    public static boolean prime(int num)
    {
        if(num==2)
        {
            return true;
        }
        if(num%2==0)
        {
            return false;
        }
        for(int i=3; i*i<=num; i+=2)
        {
            if(num%i ==0)
            {
                return false;
            }
        }
        return true;
    }
}