public class Question14_Consecutive_1s_not_allowed {
    public static void main(String[] args) {
        int n = 2;
//         ch = '\u0000';
//        solve("", n, "");
//        System.out.println(countStrings(n));
        solve(n, 0, "");
    }
    public static int count = 0;
//    static int countStrings(int n) {
//        // code here
//        solve("", n, "");
//        return count;
//    }
    public static void solve(int n, int lastPlace, String str)
    {
        if(n==0){
            System.out.println(str);
            return;
        }
        solve(n-1, 0, str+"0");
        if(lastPlace==0)
        {
            solve(n-1, 1, str+"1");
        }
    }
//    public static void solve(String s, int n, String lastChar)
//    {
//        if(s.length()==n)
//        {
//            count++;
//            return;
//        }
//        solve(s+"0", n, lastChar+'0');
//        if((lastChar.isEmpty()) || (lastChar.charAt(lastChar.length()-1) != '1') )
//        {
//            solve(s+'1', n, lastChar+'1');
//        }
//    }
//    public static void solve(String s, int n, String lastChar)
//    {
//        if(s.length()==n)
//        {
//            System.out.println(s);
//            return;
//        }
//        solve(s+"0", n, lastChar+'0');
//        if((lastChar.isEmpty()) || (lastChar.charAt(lastChar.length()-1) != '1') )
//        {
//            solve(s+'1', n, lastChar+'1');
//        }
//    }
}
