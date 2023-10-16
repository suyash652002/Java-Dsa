package com.suyash;

public class Max_Wealth {

    public static int addmax(int[][] arr)
    {
        int maxans = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            int sum = 0;
            for(int j = 0; j<arr[i].length; j++)
            {
                sum+=arr[i][j];
                maxans = Math.max(maxans, sum);
            }
        }
        return maxans;
    }
    public static void main(String[] args) {
        int[][] arr ={
            {1,5},
            {7,3},
            {6,5}
        };
        int ans = addmax(arr);
        System.out.println(ans);

    }
}
