package com.suyash;

public class majorityElement {
//    **** Brute force solution ****
//    public static int majority(int[] arr)
//    {
//        int n = arr.length;
//        for(int i = 0; i<n; i++)
//        {
//            int count = 0;
//            for(int j = 0; j<n; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    count++;
//                }
//            }
//            if(count > n/2)
//            {
//                return arr[i];
//            }
//        }
//        return -1;
//    }

    public static int majority(int[] arr)
    {
        int n = arr.length;
        int count = 0;
        int element = 0;
        for(int i = 0; i<n; i++)
        {
            if(count == 0)
            {
                element = arr[i];
                count = 1;
            }
            else if(arr[i] == element)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        count = 0;
        for(int i = 0; i<n; i++)
        {
            if(arr[i] == element) count++;
        }
        if(count > n/2) return element;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majority(arr));
    }
}
