package com.suyash;

import java.util.ArrayList;

public class Snake_pattern {

    public static ArrayList<Integer> find(int[][] arr)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i<arr.length; i++)
        {
            if(i%2==0)
            {
                for(int j = 0; j<arr[i].length; j++)
                {
                    ans.add(arr[i][j]);
                }
            }
            else{
                for(int j = arr[i].length-1; j>=0; j--)
                {
                    ans.add(arr[i][j]);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {45, 48, 54},
                {21, 89, 87},
                {70, 78, 15}
        };
        ArrayList<Integer> ans = find(arr);
        System.out.println(ans);
    }
}
