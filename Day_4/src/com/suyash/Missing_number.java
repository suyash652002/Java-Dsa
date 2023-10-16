package com.suyash;

public class Missing_number {
    public static int missing(int[] arr)
    {
        int n = arr.length;
        int arr_sum = 0;
        for(int i = 0; i<n; i++)
        {
            arr_sum+=arr[i];
        }
        int actual_sum = (n*(n+1))/2;
        int ans = actual_sum-arr_sum;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 0, 3};
        System.out.println(missing(arr));
    }
}
