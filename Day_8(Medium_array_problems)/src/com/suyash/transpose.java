package com.suyash;

import java.util.ArrayList;

public class transpose {
    public static void transPose(int[][] arr)
    {
//        int row = arr.length;
//        int col = arr[0].length;
//        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int row = 0; row < 4; row++)
        {
            for(int col = row+1; col< 4; col++)
            {

                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
    }


    public static void print(int[][] arr)
    {
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        transPose(arr);
        print(arr);
    }
}
