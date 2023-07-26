package com.suyash;

import java.util.Scanner;


public class LinearSearch {
    static int Linear_Search(int[] arr, int key)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = new int[5];
        System.out.println("Enter the elements of array");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the key: ");
        int key = in.nextInt();
        System.out.println("The element is present at index no. : "+Linear_Search(arr, key));
    }
}
