package dailychallenge.Day72;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcbb";

        System.out.print(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
        {
            return 0;
        }

        int[] freq = new int[256];

        int start = 0;

        int maxLen = Integer.MIN_VALUE;

        for(int end = 0; end < s.length(); end++)
        {
            freq[s.charAt(end)]++;

            while(freq[s.charAt(end)] > 1)
            {
                freq[s.charAt(start)]--;

                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
