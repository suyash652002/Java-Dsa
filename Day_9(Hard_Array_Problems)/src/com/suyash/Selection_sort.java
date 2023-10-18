package com.suyash;

public class Selection_sort {
    public static void sort(int[] arr)
    {
        int n = arr.length;
        int minIndex = 0;
        for(int i = 0; i<n-1; i++)
        {
            minIndex = i;
            for(int j = i+1; j<n; j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void print(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        sort(arr);
        print(arr);
    }
}
