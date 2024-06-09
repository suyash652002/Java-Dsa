import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_consecutive {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(find(arr));
    }
    public static int find(int[] arr)
    {
        Set<Integer> st = new HashSet<>();
        int longest = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            st.add(arr[i]);
        }
        for(int it : st)
        {
            if(!st.contains(it-1))
            {
                count = 1;
                int x = it;
                while(st.contains(x+1))
                {
                    count++;
                    x++;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }
//    public static int find(int[] arr)
//    {
//        Arrays.sort(arr);
//        int longest = Integer.MIN_VALUE;
//        int lastsmall = Integer.MAX_VALUE;
//        int count = 0;
//        for(int i = 0; i<arr.length; i++)
//        {
//            if(arr[i] - 1 == lastsmall)
//            {
//                count++;
//                lastsmall = arr[i];
//            }
//            else if(arr[i]!= lastsmall)
//            {
//                lastsmall = arr[i];
//                count = 1;
//            }
//            longest = Math.max(longest, count);
//        }
//        return longest;
//    }
}
