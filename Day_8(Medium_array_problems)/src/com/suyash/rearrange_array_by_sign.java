package com.suyash;

import java.util.ArrayList;
import java.util.Arrays;

public class rearrange_array_by_sign {
    public static int[] rearrange(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[n];
        int pos = 0;
        int neg = 1;
        for(int i = 0; i<n; i++)
        {
            if(arr[i] < 0)
            {
                ans[neg] = arr[i];
                neg+=2;
            }
            else
            {
                ans[pos] = arr[i];
                pos+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrange(arr)));
    }
}
