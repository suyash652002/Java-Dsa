package com.suyash;

import java.util.Scanner;

public class Minimum_number {

    static int Min_Number(int[] arr)
    {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the elements of array: ");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        int ans = Min_Number(arr);
        System.out.println(ans);
    }
}
