package com.suyash;

import java.util.Arrays;

public class Search_in_2Darray {


    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));
        int max = Maximum(arr);
        System.out.println(max);
    }

    static int[] Search(int[][] arr, int target)
    {
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                if(arr[row][col] == target)
                {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int Maximum(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                if(arr[row][col] > max)
                {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
