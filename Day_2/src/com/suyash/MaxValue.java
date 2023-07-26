package com.suyash;

import java.util.Scanner;

public class MaxValue {
    static void MaxVal(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("The maximum value is : " + max);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        MaxVal(arr);
    }
}
