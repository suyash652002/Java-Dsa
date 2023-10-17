package com.suyash;

public class max_subarray {

//     **** Brute force solution ***
//    public static int subarray(int[] arr)
//    {
//        int max = Integer.MIN_VALUE;
//        int n = arr.length;
//        for(int i = 0; i<n; i++)
//        {
//            int sum = arr[i];
//            for(int j = i+1; j<n; j++)
//            {
//                sum+=arr[j];
//                max = Math.max(max, sum);
//                if(sum < 0) break;
//            }
//        }
//        return max;
//    }


//    **** Optimized solution ***
    public static int subarray(int[] arr)
    {
        int n = arr.length;
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            currsum = Math.max(currsum+arr[i], arr[i]);
            max = Math.max(max, currsum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = subarray(a);
        System.out.println(ans);

    }
}
