package com.suyash;

public class maxConsecutiveOne {
    public static int maxone(int[] arr)
    {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == 1) count++;
            max = Math.max(max, count);
            if(arr[i] != 1) count = 0;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(maxone(arr));
    }
}
