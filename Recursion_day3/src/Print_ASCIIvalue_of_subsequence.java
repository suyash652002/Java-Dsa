public class Print_ASCIIvalue_of_subsequence {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println((int)(ch));
        subsequence( "", "abc");
    }

    public static void subsequence(String p, String str)
    {
        if(str.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int ch = str.charAt(0);
        subsequence(p, str.substring(1));
        subsequence(p+ch, str.substring(1));

    }
}
