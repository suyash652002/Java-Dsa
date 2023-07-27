package com.suyash;

public class Max_Wealth {
    public static void main(String[] args) {
        int[][] arr = { {1, 4}, {5, 4}, {10, 2}};

        int ans = Max(arr);
        System.out.println(ans);

    }
    static int Max(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            int sum = 0;
            for(int j = 0; j<arr[i].length; j++)
            {
                sum = sum + arr[i][j];
            }
            if(sum > max)
            {
                max = sum;
            }
        }
        return max;
    }
}
