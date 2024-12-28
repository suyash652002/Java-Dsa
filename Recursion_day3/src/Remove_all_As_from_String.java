public class Remove_all_As_from_String {
    public static void main(String[] args) {
        String name = "suyash";
//        System.out.println(solve(name, 0));

//        solve_with_recursion("", "asafsa");
        System.out.println(solve_with_recursion2("sfsaasadas"));
    }
    public static void solve_with_recursion(String pro, String og)
    {
        if(og.isEmpty())
        {
            System.out.println(pro);
            return;
        }
        char ch = og.charAt(0);
        if(ch=='a')
        {
             solve_with_recursion(pro, og.substring(1));
        }
        else
        {
             solve_with_recursion(pro+=ch, og.substring(1));
        }

    }

    static String solve_with_recursion2(String str)
    {
        if(str.isEmpty()) return "";
        char ch = str.charAt(0);
        if(ch == 'a')
        {
            return solve_with_recursion2(str.substring(1));
        }
        else
        {
            return ch + solve_with_recursion2(str.substring(1));
        }

    }
    public static String solve(String str, int i)
    {
        String ans = "";
        if(i==str.length())
        {
            return ans;
        }
        if(str.charAt(i) != 'a')
        {
            ans+=str.charAt(i);
        }
        String ansfrombelow = solve(str, i+1);
        ans += ansfrombelow;
        return ans;
    }
}
