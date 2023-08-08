package com.suyash;

import java.util.Arrays;

public class Array_is_sorted_ornot {
    static int isSorted(int n, int []a) {

        for(int i = 0; i<n-1; i++)
        {
            if(a[i] > a[i+1])
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 0};
        int ans = isSorted(5, arr);
        System.out.println((ans));
    }
}
