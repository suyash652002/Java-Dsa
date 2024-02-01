package com.suyash;

import java.util.*;

public class practise {

    public static void reverse(int[] arr, int s, int e)
    {
        while(s<=e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }

//    [1, 2, 3, 4, 100, 200]
    public static int solve(int[] arr)
    {
        int ans = 0;
        int n = arr.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        rmax[n-1] = arr[n-1];
        for(int i = 1; i<n; i++)
        {
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }
        for(int i = n-2; i>=0; i--)
        {
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }
        for(int i = 1; i<n-1; i++)
        {
            ans += Math.min(lmax[i], rmax[i]) - arr[i];
        }
        return ans;
    }
    public static void solvematrix(int[][] matrix)
    {
        for(int i = 0; i<matrix.length; i++)
        {
            for(int j = i; j<matrix[i].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i<matrix.length; i++)
        {
            int low = 0, high = matrix[i].length-1;
            while(low<high)
            {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
    }
    static void print(int[][] arr)
    {
        for (int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 0, 0, 2, 0, 4};
//        System.out.println((solve(arr)));
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        int[][] ans = solvematrix(arr1);
        solvematrix(arr1);
        print(arr1);
//        System.out.println((ans));

    }
}
