public class Largest_Odd_Number_in_String {
    public static void main(String[] args) {
        String str = "52";
//        System.out.println(str.substring(0, 5));
        System.out.println(solve(str));
    }
    public static String solve(String str)
    {
        for(int i = str.length()-1; i>=0; i--)
        {
            if((int)(str.charAt(i))%2==1)
            {
                return str.substring(0, i+1);
            }
        }
        return "";
    }
}
