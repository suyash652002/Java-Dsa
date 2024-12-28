import java.util.ArrayList;

public class linear_search_multiple_occ {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 5, 6, 5, 1, 5};
        int key = 5;
//        ArrayList<Integer> ans = new ArrayList<>();
//        System.out.println(search(arr, key, new ArrayList<>(), 0));
        System.out.println(search2(arr, key, 0));
    }
  // with argument
    public static ArrayList<Integer> search(int[] arr, int key, ArrayList<Integer> ans, int i)
    {
        if(arr[i] == key) ans.add(i);
        if(i == arr.length-1) return ans;
        return search(arr, key, ans, i+1);
    }

    // without argument
    public static ArrayList<Integer> search2(int[] arr, int key, int i)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[i] == key)
        {
            ans.add(i);
        }
        if(i == arr.length-1)
        {
            return ans;
        }

        ArrayList<Integer> anslist = (search2(arr, key, i+1));
        ans.addAll(anslist);
        return ans;
    }

}
