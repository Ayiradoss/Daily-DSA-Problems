package dailychallenge.Day31;

public class MaximumPointsYouCanObtainfromCards {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};

        int k = 3;

        System.out.print(maxScore(cardPoints, k));
    }
    public static int maxScore(int[] cardPoints, int k)
    {
        int n = cardPoints.length;

        int total = 0;

        for(int i : cardPoints)
        {
            total += i;
        }

        if(n == k)
        {
            return total;
        }

        int windowSize = n - k;

        int windowSum = 0;

        for(int i = 0; i<windowSize; i++)
        {
            windowSum += cardPoints[i];
        }

        int minWindow = windowSum;

        for(int i = windowSize; i < n; i++)
        {
            windowSum += cardPoints[i];

            windowSum -= cardPoints[i - windowSize];

            minWindow = Math.min(minWindow, windowSum);
        }
        return total - minWindow;
    }
}
