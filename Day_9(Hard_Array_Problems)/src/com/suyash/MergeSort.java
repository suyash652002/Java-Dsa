package com.suyash;

import java.util.ArrayList;

public class MergeSort {
    public static void mergesort(int[] arr, int low, int high)
    {
        int n = arr.length;
        if(low<high)
        {
            int mid = low + (high - low)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(int[] arr, int low, int mid, int high)
    {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(left <= mid &&  right <= high)
        {
            if(arr[left] <= arr[right])
            {
                ans.add(arr[left]);
                left++;
            }
            else
            {
                ans.add(arr[right]);
                right++;
            }
        }
        while(left <= mid)
        {
            ans.add(arr[left]);
            left++;
        }
        while(right <= high)
        {
            ans.add(arr[right]);
            right++;
        }
        for(int i = low; i<=high; i++)
        {
            arr[i] = ans.get(i-low);
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
        mergesort(arr, 0, arr.length-1);
        print(arr);
    }
}
