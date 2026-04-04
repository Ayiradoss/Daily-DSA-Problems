package dailychallenge.Day41;

public class FirstNonRepeatingElementIndex {
    public static void main(String[] args) {
        String str = "malayalam";

        System.out.print(firstNonRepeating(str));
    }
    public static int firstNonRepeating(String s)
    {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++)
        {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++)
        {
            if (freq[s.charAt(i) - 'a'] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
