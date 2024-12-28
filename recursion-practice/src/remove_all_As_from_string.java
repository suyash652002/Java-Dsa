public class remove_all_As_from_string {
    public static void main(String[] args) {
        String str = "baccad";
        String ans = "";
//        solve(str, ans);
        System.out.println(solve(str, ans));
    }
    public static String solve(String str, String pro)
    {
        if(str.isEmpty())
        {
            return pro;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return solve(str.substring(1), pro);
        }
        else return solve(str.substring(1), pro+=ch);
    }
}
