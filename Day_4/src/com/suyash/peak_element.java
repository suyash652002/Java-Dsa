package com.suyash;

public class peak_element {
    public static int peak(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;
        while(s<e)
        {
            int mid = (s + e)/2;
            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid] < arr[mid+1])
            {
                s = mid+1;
            }
            else e = mid -1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0};
        System.out.println(peak(arr));
    }
}
