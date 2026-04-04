package dailychallenge.Day41;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        String str = "malayalam";

        System.out.print(firstNonRepeating(str));
    }
    public static char firstNonRepeating(String s)
    {
        int[] freq = new int[26];

        for(char ch : s.toCharArray())
        {
            freq[ch - 'a']++;
        }
        for(char ch : s.toCharArray())
        {
            if(freq[ch - 'a'] == 1)
            {
                return ch;
            }
        }
        return '-';
    }
}
