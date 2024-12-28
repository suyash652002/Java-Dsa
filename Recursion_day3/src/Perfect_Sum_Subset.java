import java.util.*;
public class Perfect_Sum_Subset {

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 10, 6, 8};
        int sum = 10;
//        System.out.println(perfectSum(arr, arr.length, sum));
//        int ans = solve(arr, new ArrayList<>(), sum, 0, 0, 0);
//        System.out.println(ans);
        System.out.println(solve(arr, sum, 0, 0, 0));
    }
//    public static int perfectSum(int arr[],int n, int sum)
//    {
//        // Your code goes here
//        int ans = solve(arr, new ArrayList<>(), sum, 0, 0, 0);
//        return ans;
//
//    }
static final int MOD = 1000000007;
public static int solve(int[] arr, int sum, int calsum, int count, int i)
{
    if(i == arr.length)
    {
        return calsum == sum ? 1 : 0;
    }

    int left = solve(arr, sum, calsum + arr[i], count, i+1);
    int right = solve(arr, sum, calsum, count, i+1);
    return (left+right) % MOD;
}
//    public static void solve(int[] arr, List<Integer> ans, int sum, int calsum, int count, int i)
//    {
//        if(i == arr.length)
//        {
//            if(calsum == sum)
//            {
//                System.out.println(ans);
//            }
//            return;
//        }
//
//        ans.add(arr[i]);
//        calsum += arr[i];
//        solve(arr, ans, sum, calsum, count, i+1);
//        calsum -= arr[i];
//        ans.remove(ans.size() - 1);
//        solve(arr, ans, sum, calsum, count, i+1);
//
//    }
}

