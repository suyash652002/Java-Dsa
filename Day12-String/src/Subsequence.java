public class Subsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t)
    {
        int i = 0;
        int j = 0;
        int n = s.length();
        int m = t.length();
        while(i<n && j<m)
        {
            if(s.charAt(i) == t.charAt(j))
            {
                i++;
                j++;
            }
            else j++;
        }
        return (i==n);
    }
}
