package com.suyash;

import java.util.Arrays;

public class sort012 {

//    public static int[] sort(int[] arr)
//    {
//        int n = arr.length;
//        int count_0 = 0;
//        int count_1 = 0;
//        int count_2 = 0;
//        for(int i = 0; i<n; i++) // 00 11 22
//        {
//            if(arr[i] == 0)
//            {
//                count_0++;
//            }
//            else if(arr[i] == 1)
//            {
//                count_1++;
//            }
//            else
//            {
//                count_2++;
//            }
//        }
//        int index = 0;
//        for(int i = 0;i<count_0; i++)
//        {
//            arr[index] = 0;
//            index++;
//        }
//        for(int i = 0; i<count_1; i++)
//        {
//            arr[index] = 1;
//            index++;
//        }
//        for (int i = 0; i<count_2; i++)
//        {
//            arr[index] = 2;
//            index++;
//        }
//        return arr;
//    }

//    ****** 2nd approach ********
    public static void swap(int[] arr, int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    public static int[] sort(int[] arr)
    {
        int low = 0, mid = 0, high = arr.length-1;

        while(mid<=high)
        {
            if(arr[mid] == 0)
            {
                swap(arr, mid, low);
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
