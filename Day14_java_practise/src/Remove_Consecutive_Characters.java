import java.util.*;
public class Remove_Consecutive_Characters {
    public static void main(String[] args) {
        String str = "aabaa";
        System.out.println(removeConsecutiveCharacter(str));
    }
    public static String removeConsecutiveCharacter(String s){
        String ans = "";
        Stack<Character> st = new Stack<>();
        ans += s.charAt(0);
        st.push(s.charAt(0));
        for(int i = 1; i<s.length(); i++)
        {
            if(s.charAt(i) != st.peek())
            {
                ans += s.charAt(i);
                st.pop();
                st.push(s.charAt(i));
            }
        }
        return ans;
    }
}
