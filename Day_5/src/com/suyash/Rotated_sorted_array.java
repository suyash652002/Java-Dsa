package com.suyash;

public class Rotated_sorted_array {

    static int findpivot(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(mid < e && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            if(mid > s && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid] <= arr[s])
            {
                e = mid;
            }
            else if(arr[mid] > arr[s])
            {
                s = mid + 1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] arr, int target, int s, int e)
    {
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(target < arr[mid])
            {
                e = mid - 1;
            }
            else if(target > arr[mid])
            {
                s = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target)
    {
        int pivot = findpivot(arr);
        if(pivot == -1)
        {
            return binarysearch(arr, target, 0, arr.length-1);
        }
        if(pivot == target)
        {
            return pivot;
        }
        if(target >= arr[0])
        {
            return binarysearch(arr, target, 0, pivot-1);
        }
        return binarysearch(arr, target, pivot+1, arr.length-1);
    }


    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 2;
        int ans = search(arr, target);
        System.out.println(ans);
    }
}
