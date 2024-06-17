public class Remove_Outermost_paranthesis {

    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(solve(str));
    }
    public static String solve(String str)
    {
        String res = "";
        int count = 0;
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) == '(')
            {
                if(count > 0) res += str.charAt(i);
                count++;
            }
            else if(str.charAt(i) == ')')
            {
                count--;
                if(count > 0) res+= str.charAt(i);
            }
        }
        return res;
    }
}
