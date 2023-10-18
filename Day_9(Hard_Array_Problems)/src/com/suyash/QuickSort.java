package com.suyash;

public class QuickSort {
    public static void quicksort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int partitionIndex = partition(arr, low, high);
            quicksort(arr, low, partitionIndex-1);
            quicksort(arr, partitionIndex+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high)
    {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while(i<j)
        {
            while(i <= high-1 && arr[i] <= pivot) i++;
            while(j >= low+1 && arr[j] > pivot) j--;
            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
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
        quicksort(arr, 0, arr.length-1);
        print(arr);
    }
}
