import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Question4_Subset_Sums_1 {

    public static void main(String[] args) {
//        Given a array arr of integers, return the sums of all subsets in the list.
////        Return the sums in any order.
////        Examples:
////        Input: arr[] = [2, 3]
////        Output: [0, 2, 3, 5]
        int[] arr = {1, 2, 1};
        subset(arr, 0, new ArrayList<>());
//        System.out.println(subsetSums(arr));
    }

//    public static ArrayList<Integer> subsetSums(int[] arr) {
//        // code here
//        ArrayList<Integer> ans = new ArrayList<>();
//        subset(arr, 0, new ArrayList<>(), ans);
//        Collections.sort(ans);
//        return ans;
//    }

//    public static void subset(int[] arr, int index, ArrayList<Integer> ans, ArrayList<Integer> finalans)
//    {
//        if(index == arr.length)
//        {
//            int sum = 0;
//            for(int i : ans)
//            {
//                sum += i;
//            }
//            finalans.add(sum);
//            return;
//        }
//        ans.add(arr[index]);
//        subset(arr, index+1, ans, finalans);
//        ans.remove(ans.size()-1);
//        subset(arr, index+1, ans, finalans);
//    }
    public static void subset(int[] arr, int index, List<Integer> ans)
    {
        if(index == arr.length){
            System.out.println(ans);
            return;
        }
        ans.add(arr[index]);
        subset(arr, index+1, ans);
        ans.remove(ans.size()-1);
        subset(arr, index+1, ans);
    }
}
