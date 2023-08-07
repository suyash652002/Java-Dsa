package com.suyash;

public class peakElement {
    static int PeakElement(int[] arr)
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

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0};
        int ans = PeakElement(arr);
        System.out.println(ans);
    }
}
