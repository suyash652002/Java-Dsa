package com.suyash;

public class CountSort {
    // 0, 1, 2, 3, 4
    // 1, 2, 3, 4, 5
    public static void sort(int[] arr)
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
    }
    public static void print(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        sort(arr);
        print(arr);
    }
}
