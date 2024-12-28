public class Remove_Duplicates {
    public static void main(String[] args) {
        String name = "Suyash";
//        solve("", name);
        System.out.println(solve("", name));
    }
    public static String solve(String ans, String str)
    {
        str = str.toLowerCase();
        if(str.isEmpty()) return ans;

        char ch = str.charAt(0);
        if(!ans.contains(Character.toString(ch)))
        {
            return solve(ans+ch, str.substring(1));
        }
        else return solve(ans, str.substring(1));
    }
//    public static void solve(String ans, String str)
//    {
//        str = str.toLowerCase();
//        if(str.isEmpty())
//        {
//            System.out.println(ans);
//            return;
//        }
//
//        char ch = str.charAt(0);
//        if(!ans.contains(Character.toString(ch)))
//        {
//             solve(ans+ch, str.substring(1));
//        }
//        else  solve(ans, str.substring(1));
//    }
}
