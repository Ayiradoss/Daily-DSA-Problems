package dailychallenge.Day47;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";

        int numRows = 3;

        System.out.print(convert(s, numRows));
    }
    public static String convert(String s, int numRows) {

        if(numRows == 1)
        {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];

        for(int i = 0; i<sb.length; i++)
        {
            sb[i] = new StringBuilder();
        }

        int cnt = 0;

        boolean flag = true;

        for(int i = 0; i<s.length(); i++)
        {
            if(flag)
            {
                sb[cnt].append(s.charAt(i));

                cnt++;

                if(cnt == numRows)
                {
                    cnt -= 2;

                    flag = !flag;
                }
            }
            else
            {
                sb[cnt].append(s.charAt(i));

                cnt--;

                if(cnt == -1)
                {
                    cnt += 2;

                    flag = !flag;
                }
            }
        }

        StringBuilder sbarr = new StringBuilder();

        for(StringBuilder i : sb)
        {
            sbarr.append(i);
        }
        return sbarr.toString();
    }
}
