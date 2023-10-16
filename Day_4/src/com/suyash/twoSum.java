package com.suyash;

import java.util.ArrayList;
import java.util.Arrays;

public class twoSum {

//    *** brute force solution ***
    public static int[] sum(int[] arr, int target)
    {
        int[] ans = new int[2];
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(sum(arr, 9)));
    }
}
