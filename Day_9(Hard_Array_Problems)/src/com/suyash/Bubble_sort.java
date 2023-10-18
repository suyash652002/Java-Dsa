package com.suyash;

public class Bubble_sort {
    public static void sort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        System.out.println("Before sort");
        print(arr);
        sort(arr);
        System.out.println("After sort");
        print(arr);
    }
}
