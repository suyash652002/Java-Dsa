package com.suyash;

import java.util.Arrays;

public class MissingandDuplicate {
//    **** Brute Force Solution ****
//    public static int[] find(int[] arr)
//    {
//        int n = arr.length;
//        int missing = -1;
//        int duplicate = -1;
//        for(int i = 1; i<=n; i++)
//        {
//            int count = 0;
//            for(int j = 0; j<n; j++)
//            {
//                if(arr[j] == i)
//                {
//                    count++;
//                }
//
//            }
//            if(count > 1) duplicate = i;
//            if(count == 0) missing = i;
//            if(duplicate != -1 && missing != -1) break;
//
//        }
//        int[] ans = {missing, duplicate};
//        return ans;
//    }

//    *** Optimized Solution ****

    public static int[] find(int[] arr)
    {
        int n = arr.length;
        int s = 0;
        int sn = (n*(n+1))/2;
        int s2 = 0;
        int s2n = (n*(n+1)*(2*n+1))/6;

        for(int i = 0; i<n; i++)
        {
            s += arr[i];
            s2 += arr[i] * arr[i];
        }
        // val = x-y
        int val1 = s - sn;
        // val2 = x2-y2
        int val2 = s2 - s2n;
        // to find x+y
        val2 = val2 / val1;  // now val2 = x+y

        int x = (val1+val2)/2;
        int y = val2 - x;

        int[] ans = {x, y};
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 3};
        System.out.println(Arrays.toString(find(arr)));
    }
}
