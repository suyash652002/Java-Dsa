import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 1, 553, 131, 42, 13, 53, 345, 63, 2434};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int mid = low + (high - low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, high, mid);
        }
    }
    public static void merge(int[] arr, int low, int high, int mid)
    {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(left <= mid && right <= high)
        {
            if(arr[left] <= arr[right])
            {
                ans.add(arr[left]);
                left++;
            }
            else {
                ans.add(arr[right]);
                right++;
            }
        }
        while (left<=mid)
        {
            ans.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            ans.add(arr[right]);
            right++;
        }
        for(int i = low; i<=high; i++)
        {
            arr[i] = ans.get(i-low);
        }
    }
}
