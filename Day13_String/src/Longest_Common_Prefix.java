import java.util.Arrays;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] arr = {"dog","racecar","car"};
        System.out.println(solve(arr));
//        System.out.println(Arrays.toString(solve(arr)));
    }

    public static String solve(String[] arr)
    {
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        String ans = "";
        for(int i = 0; i<first.length(); i++)
        {
            if(first.charAt(i) == last.charAt(i))
            {
                ans += first.charAt(i);
            }
            else break;
        }
        return ans;
    }
}
