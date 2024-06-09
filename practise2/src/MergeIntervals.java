import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(find(arr));
    }
    public static List<List<Integer>> find(int[][] arr)
    {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 0; i<arr.length; i++)
        {
            int first = arr[i][0];
            int second = arr[i][1];
            while (i+1<arr.length && second>=arr[i+1][0])
            {
                second = Math.max(second, arr[i+1][1]);
                i++;
            }
            List<Integer> temp = Arrays.asList(first, second);
            ans.add(temp);
        }
        return ans;
    }
}
