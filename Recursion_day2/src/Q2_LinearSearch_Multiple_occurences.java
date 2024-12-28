import java.util.ArrayList;
import java.util.Arrays;

public class Q2_LinearSearch_Multiple_occurences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 8};
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(lsearch(arr, 4, 0, ans));
    }
    static ArrayList<Integer> lsearch(int[] arr, int key, int i, ArrayList<Integer> ans)
    {
//        ArrayList<Integer> ans = new ArrayList<>();
        if(i==arr.length) return ans;
        if(arr[i] == key) ans.add(i);
        return lsearch(arr, key, i+1, ans);
    }
}
