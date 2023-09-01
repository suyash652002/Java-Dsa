package com.suyash;

import java.util.ArrayList;
import java.util.Arrays;

public class two_sum {
    static int[] twosum(int[] a, int k)
    {
        int[] ans = {-1, -1};
        int n = a.length;
        for(int i = 0; i<n-1; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(a[i] + a[j] == k)
                {
                    ans[0] = a[i];
                    ans[1] = a[j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int[] ans = twosum(a,9);
        System.out.println(Arrays.toString(ans));
    }
}
