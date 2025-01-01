import java.util.ArrayList;
import java.util.Arrays;

public class Question6_Combinational_Sum {


    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        solve(arr, 0, 7, new ArrayList<>());
    }

    public static void solve(int[] arr, int index, int target, ArrayList<Integer> ans)
    {
        if(index == arr.length)
        {
            if(target == 0)
            {
                System.out.println(ans);

            }
            return;
        }
        if(arr[index] <= target)
        {
            ans.add(arr[index]);
            solve(arr, index, target-arr[index], ans);
            ans.remove(ans.size()-1);
        }
        solve(arr, index+1, target, ans);
    }
    public static void swap(int[] arr, int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

}
