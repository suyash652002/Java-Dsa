package com.suyash;

import java.util.ArrayList;
import java.util.Collections;

public class leaders {

//    ***** Brute force Solution *******
//    public static ArrayList<Integer> findLeaders(int[] arr)
//    {
//        ArrayList<Integer> ans = new ArrayList<Integer>();
//        int n = arr.length;
//        for(int i = 0; i<n; i++)
//        {
//            boolean flag = true;
//            for(int j = i+1; j<n; j++)
//            {
//                if(arr[i] <= arr[j])
//                {
//                    flag = false;
//                }
//            }
//            if(flag == true)
//            {
//                ans.add(arr[i]);
//            }
//        }
//        return ans;
//    }


//    **** Optimized Solution ******

    public static ArrayList<Integer> findLeaders(int[] arr)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = arr.length;
        int max_from_left = arr[n-1];
        ans.add(max_from_left);
        for(int i = n-2; i>=0; i--)
        {
            if(arr[i] > max_from_left)
            {
                ans.add(arr[i]);
                max_from_left = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        ArrayList<Integer> ans = findLeaders(arr);
        System.out.println(ans);
    }
}
