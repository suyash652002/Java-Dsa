package com.suyash;

import java.util.Arrays;

public class matrix_zero {
    public static void solve(int[][] arr)
    {
        int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                if(arr[i][j] == 0)
                {
                    col[j] = 1;
                    row[i] = 1;
                }
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                if(col[j] == 1 || row[i] == 1)
                {
                    arr[i][j] = 0;
                }
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
        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[] row = new int[4];
        solve(arr);
        print(arr);
//        System.out.println(ans);
    }
}
