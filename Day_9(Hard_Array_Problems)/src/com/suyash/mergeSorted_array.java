package com.suyash;

import java.util.Arrays;

public class mergeSorted_array {

    public static int[] merge(int[] arr1, int[]arr2)
    {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];
        int k = 0;
        int i = 0, j = 0;
        while(i<n && j<m)
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
        while(i<n)
        {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m)
        {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 5, 6};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}
