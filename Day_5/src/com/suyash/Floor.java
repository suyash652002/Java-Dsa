package com.suyash;

public class Floor {
    static int floor(int[] arr, int key)
    {
        int s = 0, e = arr.length-1;
        while(s<=e)
        {

            if(key > arr[arr.length-1])
            {
                return -1;
            }
            int mid = s + (e-s)/2;
            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid]<key)
            {
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }

        }
        return e;
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 10, 13, 19};
        int target = 11;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
}
