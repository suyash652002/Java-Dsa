package com.suyash;

public class find_unique {
    static int find(int[]a)
    {
        int n = a.length;
        int res = 0;
        for(int i = 0; i<n; i++)
        {
            res = res ^ a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 2,1, 2};
        int ans = find(a);
        System.out.println(ans);
    }
}
