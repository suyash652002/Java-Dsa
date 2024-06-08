import java.lang.reflect.Array;
import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(find(arr, 6)));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
//    public static int[] find(int[] arr, int sum)
//    {
//        int[] ans = new int[2];
//        for(int i = 0; i<arr.length; i++)
//        {
//            for(int j = i; j<arr.length; j++)
//            {
//                if(arr[i] + arr[j] == sum)
//                {
//                    ans[0] = arr[i];
//                    ans[1] = arr[j];
//                }
//            }
//        }
//        return ans;
//    }

    public static int[] find(int[] arr, int k)
    {
        int[] ans = new int[2];
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;
        while(low < high)
        {
            int sum = arr[low] + arr[high];
            if(sum < k) low++;
            else if(sum > k) high--;
            else {
                ans[0] = arr[low];
                ans[1] = arr[high];
                break;
            }
        }
        return ans;
    }
}
