import java.util.*;
public class Combinational_Sum {
    public static void main(String[] args) {
        int[] arr = {2,3};
        int target = 7;
        System.out.println(solve(new ArrayList<>(), new ArrayList<>(), arr, target,0));
    }
//
    public static List<List<Integer>> solve(List<List<Integer>> ans, List<Integer> ds, int[] arr, int target, int i)
    {
        if(i==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList <> (ds));
            }
            return ans;
        }
        if(arr[i]<=target)
        {
            ds.add(arr[i]);
            solve(ans, ds, arr, target-arr[i], i);
            ds.remove(ds.size()-1);
        }
        solve(ans, ds, arr, target, i+1);
        return ans;
    }
}
