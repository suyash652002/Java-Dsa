public class Q11_Check_palindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(checkPalindrome(str, 0));
    }
    public static boolean checkPalindrome(String str, int i)
    {
        int n = str.length();
        if(str.charAt(i) != str.charAt(n-1-i)) return false;
        if(i>=n/2) return true;
        return checkPalindrome(str, i+1);
    }
}
