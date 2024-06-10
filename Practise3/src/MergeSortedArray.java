import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 5, 6};
        System.out.println(Arrays.toString(find(arr1, arr2)));
    }
    public static int[] find(int[] arr1, int[] arr2)
    {
        int[] ans = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length &&  j<arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                ans[k] = arr1[i];
                i++;
                k++;
            }
            else
            {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < arr1.length)
        {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length)
        {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
