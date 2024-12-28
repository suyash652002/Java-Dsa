import java.util.ArrayList;

public class subset {

    public static void main(String[] args) {
//        solve("abc", " ");
        System.out.println(solve2("abc", ""));
    }
    public static void solve(String str, String ans)
    {

        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        solve(str.substring(1), ans+ch);
        solve(str.substring(1), ans);
    }

    public static ArrayList<String> solve2(String str, String ans)
    {
        if(str.isEmpty())
        {
            ArrayList<String> anslist = new ArrayList<>();
            anslist.add(ans);
            return anslist;
        }
        char ch = str.charAt(0);
        ArrayList<String> ans1 = solve2(str.substring(1), ans+ch);
        ArrayList<String> ans2 = solve2(str.substring(1), ans);
        ans1.addAll(ans2);
        return ans1;
    }
}
