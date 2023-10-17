package com.suyash;

public class Stock_Buy_and_Sell {
//    ****Brute force solution ****
//    public static int find(int[] arr)
//    {
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i<n; i++)
//        {
//            for(int j = i+1; j<n; j++)
//            {
//                if(arr[i] < arr[j])
//                {
//                    max = Math.max(max, arr[j] - arr[i]);
//                }
//            }
//        }
//        return max;
//    }

//    ***** Optimized solution ******
    public static int find(int[] arr)
    {
        int maxpro = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            minprice = Math.min(minprice, arr[i]);
            maxpro = Math.max(maxpro, arr[i] - minprice);
        }
        return maxpro;
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(find(arr));
    }
}
