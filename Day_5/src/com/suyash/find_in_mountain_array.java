package com.suyash;

public class find_in_mountain_array {
    public static int findPeak(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;
        while(s<e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[mid+1])
            {
                e = mid;
            }
            else if(arr[mid] < arr[mid+1])
            {
                s = mid + 1;
            }
        }
        return s;
    }

    public static int search(int[] arr, int s, int e, int target)
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
    public static int findInMountainArray(int target, int[] mountainArr)
    {
        int peak = findPeak(mountainArr);
        int firsttry = search(mountainArr, 0, peak, target);
        if(firsttry != -1)
        {
            return firsttry;
        }
        int secondtry = search(mountainArr, peak+1, mountainArr.length-1, target);
        if(secondtry != -1)
        {
            return secondtry;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 5;
        int ans = findInMountainArray(target, arr);
        System.out.println(ans);
    }
}
