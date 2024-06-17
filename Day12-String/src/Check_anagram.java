import java.util.Arrays;

public class Check_anagram {
    public static void main(String[] args) {
        String a = "rat";
        String b = "car";

        System.out.println(isAnagram(a, b));
    }
    public static boolean isAnagram(String s,String t)
    {

        // Your code here
        if(s.length() != t.length()) return false;
        int[] count = new int[130];
        for(int i = 0; i<s.length(); i++)
        {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for(int i = 0; i<count.length; i++)
        {
            if(count[i] != 0) return false;
        }
        return true;

    }
    public static boolean solve(String s, String t)
    {
        int[] count = new int[130];
        for(int i = 0; i<s.length(); i++)
        {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for(int i = 0; i<130; i++)
        {
            if(count[i] != 0) return false;
        }
        return true;
    }
}
