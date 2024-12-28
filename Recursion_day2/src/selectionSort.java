import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 1, 553, 131, 42, 13, 53, 345, 63, 2434};
        selectionSort_with_recursion(arr, arr.length-1, 9);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort_with_recursion(int[] arr, int r, int c)
    {
        if(r==0) return;
        if(c<r)
        {
            if(arr[c]>arr[r])
            {
                int temp = arr[c];
                arr[c] = arr[r];
                arr[r] = temp;
            }
            selectionSort_with_recursion(arr, r, c+1);
        }
        else
        {
            selectionSort_with_recursion(arr, r-1, 0);
        }
    }

    static void selectionSort2(int[] arr)
    {
        for(int i = arr.length-1; i>0; i--)
        {
            int maxIndex = i;
            for(int j = i-1; j>=0; j--)
            {
                if(arr[j]>arr[maxIndex])
                {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
    static void selectionSort(int[] arr)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
