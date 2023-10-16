package com.suyash;

public class findUnique {


//    *** Brute force solution *****
//    public static int unique(int[] arr)
//    {
//        int n = arr.length;
//        for(int i = 0; i<n; i++)
//        {
//            int count = 0;
//            for(int j = 0; j<n; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    count++;
//                }
//            }
//            if(count == 1)
//            {
//                return arr[i];
//            }
//        }
//        return -1;
//    }


//     *** Optimized solution ***
    public  static int unique(int[] arr)
    {
        int ans = 0;
        for(int i = 0; i<arr.length; i++)
        {
            ans = ans ^ arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2, 4, 6};
        System.out.println(unique(arr));
    }
}
