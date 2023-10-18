package com.suyash;

import java.util.Arrays;

public class Duplicate_Number {
    public static int duplicate(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
            {
                i++;
            }
        }
        for(int j = 0; j<n; j++)
        {
            if(arr[j] != j+1)
                return arr[j];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 1, 2};
//        System.out.println(duplicate(arr));
        System.out.println(duplicate(arr));
    }
}
