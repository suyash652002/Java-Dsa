package com.suyash;

public class Missing_number {
    static int find(int[]a)
    {
        int n = a.length;
        int totalsum = (n*(n+1))/2;
        int sum = 0, ans = 0;
        for(int i = 0; i<n; i++)
        {
            sum += a[i];
        }
        ans = totalsum - sum;
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int ans = find(a);
        System.out.println(ans);
    }
}
