import java.util.*;
public class Question11_Letter_Combinations_of_Phone_number {
    public static void main(String[] args) {
//        Input: digits = "23"
//        Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        String digits = "23";
//        practice(digits);
        System.out.println(combinations(digits));
    }

    public static final String[] Paths = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> combinations(String digits)
    {
        List<String> ans = new ArrayList<>();
        solve(digits, 0, ans, new StringBuilder());
        return ans;
    }
    public static void solve(String digits, int index, List<String> ans, StringBuilder newCombination)
    {
        if(index == digits.length())
        {
            ans.add(newCombination.toString());
            return;
        }
        int digit= digits.charAt(index)-'0';
        String letters = Paths[digit];
//        System.out.println(letters);
        for(int i = 0; i<letters.length(); i++)
        {
            char[] arr = letters.toCharArray();
            newCombination.append(arr[i]);
            solve(digits, index+1, ans, newCombination);
            newCombination.deleteCharAt(newCombination.length()-1);
        }
    }

    public static void practice(String digits)
    {
        for(int i = 0; i<digits.length(); i++)
        {
            int digit = digits.charAt(i) - '0';
            System.out.println(digit);
        }
    }
}