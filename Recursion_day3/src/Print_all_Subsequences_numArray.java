import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Print_all_Subsequences_numArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 10, 6, 8};
//        subsets(arr, new ArrayList<>(), 0);
        System.out.println(subset1(new ArrayList<>(), new ArrayList<>(), arr, 0));
    }
//    *********** BRUTE FORCE APPROACH************
//    public static List<List<Integer>> subsets(int[] arr) {
//        List<List<Integer>> ans = new ArrayList<>();
//        ans.add(Arrays.asList());
//        for(int i = 0; i<arr.length; i++)
//        {
//            for(int j = i; j<arr.length; j++)
//            {
//                List<Integer> temp = new ArrayList<>();
//                for(int k = i; k<=j; k++)
//                {
//                    temp.add(arr[k]);
//                }
//                ans.add(temp);
//            }
//        }
//        return ans;
//    }
public static List<List<Integer>> subset1(List<List<Integer>> result, List<Integer> ans, int[] arr, int i) {
    if (i == arr.length) {
        result.add(new ArrayList<>(ans)); // Add a copy of 'ans' to avoid reference issues
        return result;
    }

    // Include arr[i]
    ans.add(arr[i]);
    subset1(result, ans, arr, i + 1); // Recursive call

    ans.remove(ans.size() - 1); // Backtrack
    subset1(result, ans, arr, i + 1); // Recursive call

    return result; // Return the result
}


    public static void subsets(int[] arr, List<Integer> ans, int i)
    {
        if(i == arr.length)
        {
            System.out.println(ans);
            return;
        }
        ans.add(arr[i]);
        subsets(arr, ans, i+1);
        ans.remove(ans.size()-1);
        subsets(arr, ans, i+1);
    }
}
