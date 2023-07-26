package com.suyash;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {

    static void reverse(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;
        for(int i = 0; i<arr.length; i++)
        {
            if(s<e)
            {
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                s++;
                e--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        reverse(arr);
    }
}
