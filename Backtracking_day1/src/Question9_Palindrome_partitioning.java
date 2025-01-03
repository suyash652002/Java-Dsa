import java.util.ArrayList;
import java.util.List;

public class Question9_Palindrome_partitioning {
    public static void main(String[] args) {
        String str = "aab";
//        System.out.println(isPalindrome(str, 0, str.length()-1));
//        solve(str, 0, new ArrayList<>(), new ArrayList<>());
        System.out.println(partition(str));
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> anslist = new ArrayList<>();
        solve(s, 0, new ArrayList<>(), anslist);
        return anslist;
    }
    public static void solve(String str, int index, List<String> ans, List<List<String>> anslist)
    {
        if(index == str.length() )
        {
            anslist.add(new ArrayList<>(ans));
            return;
        }
        for(int i = index; i<str.length(); i++)
        {
            if(isPalindrome(str, index, i))
            {
                ans.add(str.substring(index, i+1));
                solve(str, i+1, ans, anslist);
                ans.remove(ans.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String str, int start, int end)
    {
        while(start<=end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
