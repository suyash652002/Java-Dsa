import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4_Find_Permutations_2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
//        solve(arr, 0);
//        tryswap(arr);
        System.out.println(permute(arr));
    }



    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(0, nums, ans);
        return ans;
    }
    public static void permutation( int index, int[] nums, List<List<Integer>> ans)
    {
        if(index == nums.length-1)
        {
            List<Integer> temp = new ArrayList<>();
            for(int i:nums)
            {
                temp.add(i);
            }
            ans.add(temp);
        }

        for(int i = index; i<nums.length; i++)
        {
            swap(nums, index, i);
            permutation(index+1, nums, ans);
            swap(nums, index, i);
        }
    }
    public static void solve(int[] arr, int index)
    {
        if(index == arr.length-1)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i = index; i<arr.length; i++)
        {
            swap(arr, index, i);
//            System.out.println(Arrays.toString(arr));
            solve(arr, index+1);
            swap(arr, index, i);
        }
    }
    public static void swap(int[] arr, int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

}
