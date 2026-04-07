package dailychallenge.Day44;

public class MaximumNumberOfOperationsToMoveOnesToEnd {
    public static void main(String[] args) {
        String str = "1001101";

        System.out.print(maxOperations(str));
    }
    public static int maxOperations(String s) {

        int ones = 0;

        int allcount = 0;

        for(int i =0; i<s.length(); i++)
        {
            if(s.charAt(i) == '1')
            {
                ones++;
            }
            else if(i>0 && s.charAt(i-1) == '1')
            {
                allcount += ones;
            }
        }
        return allcount;
    }
}
