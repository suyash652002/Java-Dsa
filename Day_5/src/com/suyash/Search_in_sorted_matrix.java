package com.suyash;

import java.util.Arrays;

public class Search_in_sorted_matrix {

    static int[] search(int[][]arr, int target)
    {
        int r = 0;
        int c = arr[0].length-1;
        while(r < arr.length && c >= 0)
        {
            if(arr[r][c] == target)
            {
                return new int[] {r,c};
            }
            else if(arr[r][c] < target)
            {
                r++;
            }
            else
            {
                c--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 37, 38, 50}
                        };
        int target = 37;
//        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(search(arr, 37)));
    }
}
