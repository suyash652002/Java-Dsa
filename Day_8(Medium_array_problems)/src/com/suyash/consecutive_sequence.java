package com.suyash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class consecutive_sequence {


//    public static int find(int[] arr)
//    {
//        int n = arr.length;
//        Arrays.sort(arr);    // 1, 2, 3, 4, 100, 200
//        int longest = 1;
//        int count = 0;
//        int insequence = Integer.MAX_VALUE;
//        for(int i = 0; i<n; i++)
//        {
//            if(arr[i]-1 == insequence)
//            {
//                count++;
//                insequence = arr[i];
//            }
//            else if(arr[i] != insequence)
//            {
//                count = 1;
//                insequence = arr[i];
//            }
//            longest = Math.max(longest, count);
//        }
//        return longest;
//    }

//     *** Better approach ***
    public static int find(int[] arr)
    {
        int n = arr.length;
        int longest = 1;
        int count = 0;
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i<n; i++)
        {
            set.add(arr[i]);
        }
        for(int it : set)
        {
            if(!(set.contains(it-1)))   // then it is the first element in sequence
            {
                count = 1;
                int x = it;

                while(set.contains(x+1))
                {
                    x += 1;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(find(arr));
    }
}
