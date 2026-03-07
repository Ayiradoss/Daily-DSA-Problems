package dailychallenge.Day19;

public class EncodeString {
    public static void main(String[] args) {

        String s = "aaabbc";

        System.out.println(encode(s));
    }

    public static String encode(String s)
    {

        StringBuilder result = new StringBuilder();

        int count = 1;

        for(int i = 1; i < s.length(); i++)
        {

            if(s.charAt(i) == s.charAt(i-1))
            {
                count++;
            }
            else
            {
                result.append(count).append(s.charAt(i-1));
                count = 1;
            }
        }

        result.append(count).append(s.charAt(s.length()-1));

        return result.toString();
    }
}