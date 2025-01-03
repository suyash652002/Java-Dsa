import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Question12_Permutation_with_Spaces {
    public static void main(String[] args) {
        String s = "ABC";
        Set<String> anslist = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        solve(s, 0, "", result);
//        for(String i: anslist)
//        {
//            result.add(i);
//        }
        System.out.println(result);
        //(A B C)(A BC)(AB C)(ABC)
    }
    public static void solve(String s, int index, String ans, ArrayList<String> anslist)
    {
        if(index==s.length())
        {
            if(!anslist.contains(ans.trim()))
            {
                anslist.add(ans.trim());
            }
            return;
        }
        char ch = s.charAt(index);
        solve(s, index+1,ans+" "+ch, anslist);
        solve(s, index+1, ans+ch, anslist);
    }
}
