package dailychallenge.Day66;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        String num = "352153";

        int k = 3;

        System.out.print(removeKdigits(num, k));
    }
    public static String removeKdigits(String num, int k)
    {
        Stack<Character> st = new Stack<>();

        int removed = 0;

        for(int i = 0; i < num.length(); i++)
        {
            char ch = num.charAt(i);

            while(!st.isEmpty() && removed < k && st.peek() > ch)
            {
                st.pop();

                removed++;
            }
            st.push(ch);
        }
        while(removed < k && !st.isEmpty())
        {
            st.pop();

            removed++;
        }
        StringBuilder sb = new StringBuilder();

        for(char ch : st)
        {
            sb.append(ch);
        }
        while(!sb.isEmpty() && sb.charAt(0) == '0')
        {
            sb.deleteCharAt(0);
        }
        return sb.isEmpty() ? "0" : sb.toString();
    }
}
