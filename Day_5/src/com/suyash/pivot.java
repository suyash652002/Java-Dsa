package com.suyash;

public class pivot {
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

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int ans = findpivot(arr);
        System.out.println(ans);

    }
}
