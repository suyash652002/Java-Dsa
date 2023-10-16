package com.suyash;

import java.util.Arrays;

public class removeDuplicate {

    public static int[] findans(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        for(int j = 0; j<n; j++)
        {
            if(arr[j] != arr[i])
            {
                i++;
                arr[i] = arr[j];
            }
            else
            {
                continue;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
//        [0,0,1,1,1,2,2,3,3,4]
//        output = [0,1,2,3,4,_,_,_,_,_]
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] ans = findans(arr);
        System.out.println(Arrays.toString(ans));
    }
}
