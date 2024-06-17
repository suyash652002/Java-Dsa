public class validPalindrome {
    public static void main(String[] args) {
        String str = "aa";
        System.out.println(ispalindrome(str));
    }
    public static boolean ispalindrome(String str){
        str = str.toLowerCase();
        int s = 0;
        int e = str.length()-1;
        while(s<e)
        {
            if(str.charAt(s) != str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}
