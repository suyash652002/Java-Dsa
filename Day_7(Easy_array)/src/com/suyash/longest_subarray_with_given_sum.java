package com.suyash;

public class longest_subarray_with_given_sum {

//    ***** Brute Force Solution *******
//    static int longestSubarray(int[] a, long k)
//    {
//        int n = a.length;
//        int maxlen = 0;
//        for(int i = 0; i<n; i++)
//        {
//            int sum = 0;
//            for(int j = i; j<n; j++)
//            {
//                sum += a[j];
//                if(sum == k)
//                {
//                    maxlen = Math.max(maxlen, j-i+1);
//                }
//            }
//        }
//        return maxlen;
//    }


//    ***** Optimized Solution **********
    static int longestSubarray(int[] a, long k)
    {
        int n = a.length;
        int left = 0, right = 0;
        int sum = a[0];
        int maxlen = 0;
        while(right < n)
        {
            while(left <= right && sum > k)
            {
                sum -= a[left];
                left++;
            }
            if(sum == k)
            {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
            if(right < n)
            {
                sum += a[right];
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        int ans = longestSubarray(a, 10);
        System.out.println(ans);
    }
}
