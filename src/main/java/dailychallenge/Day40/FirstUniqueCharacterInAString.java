package dailychallenge.Day40;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String str = "Dass";

        System.out.print(firstUniqChar(str));
    }
    public static int firstUniqChar(String s)
    {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i = 0; i<s.length(); i++)
        {
            if(map.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
