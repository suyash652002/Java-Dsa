import javax.crypto.spec.PSource;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 1, 553, 131, 42, 13, 53, 345, 63, 2434};
//        sort(arr);
        sort_with_recursion(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort_with_recursion(int[] arr, int r, int c)
    {
        if(r==0) return;
        if(c<r)
        {
            if(arr[c] > arr[c+1])
            {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            sort_with_recursion(arr, r, c+1);
        }
        else
        {
            sort_with_recursion(arr, r-1, 0);
        }
    }
    public static void sort(int[] arr)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = 0; j<arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
