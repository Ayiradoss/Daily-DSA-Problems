package dailychallenge.Day43;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        System.out.print(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        int left = 0;

        int rigth = s.length()-1;

        while(left < rigth)
        {
            while(left < rigth && !isAlphaNumeric(s.charAt(left)))
            {
                left++;
            }
            while(left < rigth && !isAlphaNumeric(s.charAt(rigth)))
            {
                rigth--;
            }

            char ch1 = toLower(s.charAt(left));

            char ch2 = toLower(s.charAt(rigth));

            if(ch1 != ch2)
            {
                return false;
            }
            left++;

            rigth--;
        }
        return true;
    }

    private static boolean isAlphaNumeric(char c)
    {
        return (c >= 'a' && c <= 'z' || c >= 'A' && c <='Z' || c >= '0' && c <= '9');
    }
    private static char toLower(char c)
    {
        if(c >= 'A' && c <= 'Z')
        {
            return (char) (c + 32);
        }
        return c;
    }
}
