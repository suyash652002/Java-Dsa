import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        String s = "foo", t = "bar";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length())
        {
            int original = s.charAt(i);
            int representive = t.charAt(j);

            if(!map.containsKey(original))
            {
                if(!map.containsValue(representive))
                {
                    map.put(original, representive);
                }
                else {
                    return false;
                }
            }
            else
            {
                int mappedvalue = map.get(original);
                if(mappedvalue != representive)
                {
                    return false;
                }
                else
                {
                    i++;
                    j++;
                }
            }
        }
        return true;
    }
}
