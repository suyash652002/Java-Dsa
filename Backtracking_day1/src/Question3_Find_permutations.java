import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question3_Find_permutations {

    // a b c
    public static void main(String[] args) {
//        permutation("abc", "");
//        System.out.println(permutation1("abb", ""));

//        solvepermutation("abc", 0);
        System.out.println(findPermutation("abc"));
    }
//    public static void permutation(String str, String ans)
//    {
//        if(str.isEmpty()) System.out.println(ans);
//        for(int i = 0; i<str.length(); i++)
//        {
//            char currChar = str.charAt(i);
//            String newString = str.substring(0,i) + str.substring(i+1);
//            permutation(newString, ans+currChar);
//        }
//    }
    public static ArrayList<String> permutation1(String str, String ans)
    {
        ArrayList<String> anslist = new ArrayList<>();
        if(str.isEmpty())
        {
            anslist.add(ans);
        }
        for(int i = 0; i<str.length(); i++)
        {
            char currChar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            ArrayList<String> newAns = permutation1(newString, ans+currChar);
            anslist.addAll(newAns);
        }
        return anslist;
    }

    public static List<String> findPermutation(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        solvePermutation(0, s, ans);
        return ans;

    }
    public static void solvePermutation( int index, String s, List<String> ans)
    {
        if(index == s.length()-1)
        {
            List<String> temp = new ArrayList<>();
            temp.add(s);
            ans.addAll(temp);
            return;
        }
        for(int i = index; i<s.length(); i++)
        {
            s = swapCharacters(s, index, i);
            solvePermutation(index+1, s, ans);
            s = swapCharacters(s, index, i);
        }
    }
    public static void solvepermutation(String str, int index)
    {
        if(index == str.length()-1)
        {
            System.out.println(str);
            return;
        }
        for(int i = index; i<str.length(); i++)
        {
            str = swapCharacters(str, index, i);
            solvepermutation(str, index+1);
            str = swapCharacters(str, index, i);
        }
    }
    public static String swapCharacters(String str, int s, int e) {
        char[] charArray = str.toCharArray(); // Convert to char array
        char temp = charArray[s];            // Swap characters
        charArray[s] = charArray[e];
        charArray[e] = temp;
        return new String(charArray);        // Convert back to string
    }

}
