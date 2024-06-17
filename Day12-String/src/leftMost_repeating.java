public class leftMost_repeating {
    public static void main(String[] args) {
        String str = "abbccdeef";
        System.out.println(solve(str));
    }
    public static String solve(String str)
    {
        int[] count = new int[130];
        for(int i = 0; i<str.length(); i++)
        {
            count[str.charAt(i)]++;
        }
        for(int i = 0; i<str.length(); i++)
        {
            if(count[str.charAt(i)] > 1)
            {
                String ans = Character.toString(str.charAt(i));
                return ans;
            }
        }
        return "-1";
    }
}
