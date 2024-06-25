public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s= "dvdf";
        System.out.println(solve2(s));
    }

    public static int solve2(String s)
    {
        if(s.length() == 1) return 1;
        int length = 0;
        String temp = "";
        for(int i = 0; i<s.length(); i++)
        {
            for(int j = i; j<s.length(); j++)
            {
                char ch = s.charAt(j);
                if(!temp.contains(Character.toString(ch)))
                {
                    temp += ch;
                    length = Math.max(length, j-i+1);
                }
                else
                {
                    temp = "";
                    break;
                }
            }
        }
        return length;
    }
}
