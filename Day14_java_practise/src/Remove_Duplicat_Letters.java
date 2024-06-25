import java.util.HashMap;
import java.util.Map;

public class Remove_Duplicat_Letters {
    public static void main(String[] args) {
        String str = "cbacdcbc";
//        System.out.println(removeDuplicateLetters(str));
        System.out.println(removeDuplicateLetters2(str));
    }
    public static String removeDuplicateLetters(String s) {
        int count[] = new int[130];
        String ans = "";
        for(int i = 0; i<s.length(); i++)
        {
            count[s.charAt(i)]++;
        }
        for(int i = 0; i<count.length; i++)
        {
            if(count[i] > 0)
            {
                ans += (char)i;
            }
        }
        return ans;
    }
    public static String removeDuplicateLetters2(String s) {
//        int count[] = new int[130];
        Map<Character, Integer> mp = new HashMap<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Update the frequency in the map
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) + 1);
            } else {
                mp.put(ch, 1);
            }
        }
        for (Character ch : mp.keySet())
        {
            ans += ch;
        }
        return ans;
    }
}
