package dailychallenge.Day51;

import java.util.HashMap;
import java.util.Map;

public class StringExpansionBasedOnFirstOccurenceIndex {
    public static void main(String[] args) {
        String str = "abcaba";

        System.out.print(FirstOccurenceIndex(str));
    }
    public static String FirstOccurenceIndex(String str)
    {
        Map<Character, Integer> map = new HashMap<>();

        StringBuilder res = new StringBuilder();

        for(int i = 0; i  <str.length(); i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), i + 1);
            }
        }
        for(int i = 0; i  <str.length(); i++)
        {
            char ch = str.charAt(i);

            int count = map.get(ch);

            for(int j = 0; j < count; j++)
            {
                res.append(ch);
            }
            if(i != str.length() - 1)
            {
                res.append("-");
            }
        }
        return res.toString();
    }
}