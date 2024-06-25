import java.util.*;
public class Group_Anagrams {
    public static void main(String[] args) {
        String s = "car";
        String t = "tea";
//        System.out.println(areAnagram(s, t));
        String[] arr = {"", ""};
        System.out.println(groupAnagrams(arr));
//        System.out.println(Arrays.toString(groupAnagrams(arr)));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mp = new HashMap<>();
        for(String word : strs)
        {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String newWord = new String(ch);

            if(!mp.containsKey(newWord))
            {
                mp.put(newWord, new ArrayList<>());
            }
            mp.get(newWord).add(word);
        }

        return new ArrayList<>(mp.values());
    }

}
