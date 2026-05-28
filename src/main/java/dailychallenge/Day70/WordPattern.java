package dailychallenge.Day70;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";

        String s = "dog cat cat dog";

        System.out.print(wordPattern(pattern, s));
    }
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> charToWord = new HashMap<>();

        Map<String, Character> wordToChar = new HashMap<>();

        String[] words = s.trim().split("\\s+");

        if(pattern.length() != words.length)
        {
            return false;
        }

        for(int i = 0; i<pattern.length(); i++)
        {
            char ch = pattern.charAt(i);

            String str = words[i];

            if(charToWord.containsKey(ch))
            {
                if(!charToWord.get(ch).equals(str))
                {
                    return false;
                }
            }
            else if(wordToChar.containsKey(str))
            {
                return false;
            }
            else
            {
                charToWord.put(ch, str);

                wordToChar.put(str,ch);
            }
        }
        return true;
    }
}
