package com.suyash;

import java.util.Arrays;

public class Rotate_by_one {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int first_no = arr[0];
        for(int i = 0; i<n-1; i++)
        {
            arr[i] = arr[i+1];
        }
        arr[n-1] = first_no;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = rotateArray(arr, 5);
        System.out.println(Arrays.toString(ans));
    }
}
