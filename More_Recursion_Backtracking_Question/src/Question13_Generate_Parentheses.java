import java.util.*;

public class Question13_Generate_Parentheses {
    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(generateParenthesis(2));
//        solve(new ArrayList<>(), "(", 2, 1, 2);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans, "(", n, n-1, n);
        return ans;
    }
    public static void solve(List<String> ans, String s, int n, int open, int close)
    {
        if(s.length() == 2*n)
        {
            ans.add(s);
            return;
        }
        if(open>0)
        {
            solve(ans, s+"(", n, open-1, close);
        }
        if(close>open)
        {
            solve(ans, s+")", n, open, close-1);
        }
    }


//    public static void solve(List<String> ans, String s, int n, int open, int close)
//    {
//        if(s.length() == 2*n)
//        {
//            if(check(s))
//            {
//                ans.add(s);
//                return;
//            }
//            return;
//        }
//        if(open > 0)
//        {
//            solve(ans, s+"(", n, open-1, close);
//        }
//        if(close > 0)
//        {
//            solve(ans, s+")", n, open, close-1);
//        }
//    }
    public static boolean check(String s)
    {
        int count = 0;
        for(int i = 0; i<s.length(); i++)
        {

            if(s.charAt(i) == '(')
                count++;
            if(s.charAt(i) == ')')
                count--;
            if(count < 0)
                return false;
        }
        if(s.charAt(s.length()-1) != ')') return false;
        if(count == 0) return true;

        return false;
    }
}
