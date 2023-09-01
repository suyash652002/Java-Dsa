package com.suyash;

public class Max_Consecutive_one {
    static int count(int[]a)
    {
        int n = a.length;
        int cnt = 0;
        int max = 0;
        for(int i = 0; i<n; i++)
        {
            if(a[i] == 1)
            {
                cnt++;
                max = Math.max(max, cnt);
            }
            if(a[i] == 0)
            {
                cnt = 0;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 1};
        int ans = count(arr);
        System.out.println(ans);
    }
}
