package com.suyash;

import java.util.ArrayList;

public class BoundaryElement {
    public static ArrayList<Integer> print(int[][] arr)
    {
        int row = arr.length;
        int col = arr[0].length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(row == 1)
        {
            for(int i = 0; i<col; i++)
            {
                ans.add(arr[0][i]);
            }
        }
        if(col == 1)
        {
            for(int i = 0; i<row; i++)
            {
                ans.add(arr[i][0]);
            }
        }
        else
        {
            for(int i = 0; i<col; i++)
            {
                ans.add(arr[0][i]);
            }
            for(int i = 1; i<row; i++)
            {
                ans.add(arr[i][col-1]);
            }
            for(int i = col-2; i>=0; i--)
            {
                ans.add(arr[row-1][i]);
            }
            for(int i = row-2; i>0; i--)
            {
                ans.add(arr[i][0]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(print(arr));
    }

}
