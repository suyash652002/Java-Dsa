import java.util.ArrayList;

public class Print_all_Subsequences {


    public static void main(String[] args) {

        System.out.println(subsequence2("", "abc"));
    }
    public static ArrayList<String> subsequence2(String p, String str)
    {
        ArrayList<String> ans = new ArrayList<>();
        if(str.isEmpty())
        {
            ans.add(p);
            return ans;
        }
        char ch = str.charAt(0);
        ArrayList<String> ansfromright = subsequence2(p, str.substring(1));
        ArrayList<String> ansfromleft = subsequence2(p+ch, str.substring(1));
        ans.addAll(ansfromright);
        ans.addAll(ansfromleft);

        return ans;
    }
    public static void subsequence(String p, String str)
    {
        if(str.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        subsequence(p, str.substring(1));
        subsequence(p+ch, str.substring(1));

    }
}
