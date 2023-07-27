package com.suyash;

import java.util.Scanner;

public class Binary_Search {

    static int binary(int[] arr, int key)
    {
        int s = 0;
        int e = arr.length-1;

        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid] < key)
            {
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the elements of array: ");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = in.nextInt();

        int ans = binary(arr, key);
        System.out.println(ans);
    }
}
