import java.util.*;
public class All_duplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(sort(arr));
//        sort(arr);
//        print(arr);

    }
    public static void swap(int[] arr, int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    public static void print(int[] arr)
    {
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
    public static ArrayList<Integer> sort(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else i++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j = 0; j<n; j++)
        {
            if(j+1 != arr[j]) ans.add(arr[j]);
        }
        Collections.sort(ans);
        return ans;
    }
}
