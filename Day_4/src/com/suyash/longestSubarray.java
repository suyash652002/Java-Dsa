package com.suyash;

public class longestSubarray {

//    public static int lsubarray(int[] arr, int k)
//    {
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i<n-1; i++)
//        {
//            int sum = arr[i];
//            for(int j = i+1; j<n; j++)
//            {
//                sum+=arr[j];
//                if(sum == k)
//                {
//                    max = Math.max(max, j-i+1);
//                }
//                if(sum >k) break;
//            }
//        }
//        return max;
//    }


//     **** Optimized solution ****

    public static int lsubarray(int[] arr, int k)
    {
        int n = arr.length;
        int left = 0, right = 0;
        long sum = arr[0];
        int maxlength = 0;
        while(right < n)
        {
            if(left <= right && sum > k)
            {
                sum -= arr[left];
                left++;
            }
            else if(sum == k)
            {
                maxlength = Math.max(maxlength, right-left+1);
            }
            right++;
            if(right <n) {
                sum += arr[right];
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        System.out.println(lsubarray(arr, 10));

    }
}
