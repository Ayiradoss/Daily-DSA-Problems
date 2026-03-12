package dailychallenge.Day22;

public class SmallestSubsequenceOfDistinctCharacters {
    public static void main(String[] args) {
        String str = "cbacdcbc";

        System.out.print(smallestSubsequence(str));
    }
    public static String smallestSubsequence(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i =0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(sb.indexOf(ch+"") != -1)
            {
                continue;
            }

            while(sb.length()>0 && sb.charAt(sb.length()-1) > ch)
            {
                if(s.substring(i).contains(sb.charAt(sb.length()-1)+""))
                {
                    sb.deleteCharAt(sb.length()-1);
                }
                else
                {
                    break;
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}