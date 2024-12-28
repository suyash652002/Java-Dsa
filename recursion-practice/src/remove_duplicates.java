public class remove_duplicates {
    public static void main(String[] args) {
        String name = "aabafassasca";
//        System.out.println(name.contains("s"));
//        char ch = 's';
//        String s = Character.toString(ch);
        System.out.println(solve(name, ""));
    }

    public static String solve(String str, String ans)
    {
        if(str.isEmpty())
        {
            return ans;
        }
        char ch = str.charAt(0);
        String first = Character.toString(ch);
        if(ans.contains(first))
        {
            return solve(str.substring(1), ans);
        }
        else return solve(str.substring(1), ans+first);
    }
}
