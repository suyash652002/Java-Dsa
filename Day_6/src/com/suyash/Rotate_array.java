package com.suyash;

import java.util.Arrays;

public class Rotate_array {
    static void reverse(int[] a, int s, int e)
    {
        while(s<=e)
        {
            int temp = a[e];
            a[e] = a[s];
            a[s] = temp;
            s++;
            e--;
        }
    }
    static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
         int[] ans = rotate(arr, 3);
        System.out.println(Arrays.toString(ans));
    }
}
