package dailychallenge.Day61;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DifferentWaystoAddParentheses {
    public static void main(String[] args) {
        String expression = "2-1-1";

        System.out.println(diffWaysToCompute(expression));
    }
    public static List<Integer> diffWaysToCompute(String expression)
    {
        HashMap<String, List<Integer>> memo = new HashMap<>();

        if(memo.containsKey(expression))
        {
            return memo.get(expression);
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < expression.length(); i++)
        {
            char ch = expression.charAt(i);

            if(ch == '+'|| ch == '-'|| ch == '*')
            {
                String left = expression.substring(0, i);

                String right = expression.substring(i + 1);

                List<Integer> leftPart = diffWaysToCompute(left);

                List<Integer> rightPart = diffWaysToCompute(right);

                for(int a : leftPart)
                {
                    for(int b : rightPart)
                    {
                        if(ch == '+')
                        {
                            ans.add(a + b);
                        }
                        else if(ch == '-')
                        {
                            ans.add(a - b);
                        }
                        else
                        {
                            ans.add(a * b);
                        }
                    }
                }
            }
        }

        if(ans.size() == 0)
        {
            ans.add(Integer.parseInt(expression));
        }
        memo.put(expression, ans);

        return ans;
    }
}
