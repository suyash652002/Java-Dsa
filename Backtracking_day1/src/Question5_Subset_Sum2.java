import java.util.*;

public class Question5_Subset_Sum2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
//        System.out.println(subsetsWithDup(arr));
        solve(arr, 0, new ArrayList<>());
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> anslist = new ArrayList<>();
        Arrays.sort(nums); // Sort to handle duplicates
        generateSubsets(0, nums, new ArrayList<>(), anslist);
        return anslist;
    }

    public static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> anslist) {
        if (index == nums.length) {
            anslist.add(new ArrayList<>(current)); // Add a copy of the current subset
            return;
        }

        // Include the current element
        current.add(nums[index]);
        generateSubsets(index + 1, nums, current, anslist);
        current.remove(current.size() - 1);

        // Skip duplicate elements
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }

        // Exclude the current element and move to the next
        generateSubsets(index + 1, nums, current, anslist);
    }

    public static void solve(int[] arr, int index, ArrayList<Integer> ans)
    {
        if(index == arr.length)
        {
            System.out.println(ans);
            return;
        }
        ans.add(arr[index]);
        solve(arr, index+1, ans);
        ans.remove(ans.size()-1);
        if(index+1 != arr.length && arr[index] == arr[index+1]) index++;
        solve(arr, index+1, ans);

    }
}
