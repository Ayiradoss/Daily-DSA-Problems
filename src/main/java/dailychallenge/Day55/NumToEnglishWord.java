package dailychallenge.Day55;

public class NumToEnglishWord {
    static String[] below20 = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen" };

    static String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"};

    static String[] scales = {
            "", "Thousand", "Million", "Billion"
    };

    public static void main(String[] args) {
        int num = 3463;

        System.out.print(numberToWords(num));
    }

    public static String numberToWords(int num)
    {

        if(num == 0)
        {
            return "Zero";
        }

        int index = 0;

        String result = "";

        while(num > 0)
        {
            int path = num % 1000;

            if(path != 0)
            {
                String part = convert(path);

                result = part + " " + scales[index] + " " + result;
            }
            num = num / 1000;

            index++;
        }
        return result.trim();
    }
    public static String convert(int num)
    {
        String result = "";

        if(num >= 100)
        {
            result += below20[num / 100] + " Hundred ";

            num = num % 100;
        }

        if(num >= 20)
        {
            result += tens[num / 10] + " ";

            num = num % 10;
        }

        if(num > 0)
        {
            result += below20[num] + " ";
        }

        return result.trim();
    }
}
