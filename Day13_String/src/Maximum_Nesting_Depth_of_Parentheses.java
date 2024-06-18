public class Maximum_Nesting_Depth_of_Parentheses {
    public static void main(String[] args) {
        String s = "()(())((()()))";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
        int count = 0;
        int maxcount = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                count++;
                maxcount = Math.max(maxcount, count);
            }
            else if(s.charAt(i) == ')') count--;
        }

        return maxcount;
    }
}
