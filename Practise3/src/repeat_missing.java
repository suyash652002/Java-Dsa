import java.util.*;
public class repeat_missing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(find(arr)));
    }
    public static int[] find(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[2];
        int j = 0;
        while(j<n)
        {
            int correct = arr[j]-1;
            if(arr[j] != arr[correct])
            {
                int temp = arr[j];
                arr[j] = arr[correct];
                arr[correct] = temp;
            }
            else j++;
        }
        for(int i = 0; i<n; i++)
        {
            if(arr[i] != i+1)
            {
                ans[0] = arr[i];
                ans[1] = i+1;
            }
        }
        return ans;
    }
}
