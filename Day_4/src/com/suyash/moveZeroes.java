package com.suyash;

import java.util.Arrays;

public class moveZeroes {
    public static int[] move(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        for(int j = 0; j<arr.length; j++)
        {
            if(arr[j]!=0)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] ans = move(arr);
        System.out.println(Arrays.toString(ans));
    }
}
