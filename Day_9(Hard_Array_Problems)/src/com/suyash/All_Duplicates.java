package com.suyash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class All_Duplicates {

    public static List<Integer> duplicates(int[] arr)
    {
        List<Integer> ans = new ArrayList<Integer>();
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
            {
                i++;
            }
        }
        for(int j = 0; j<n; j++)
        {
            if(j+1 != arr[j])
            {
                ans.add(arr[j]);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void print(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(duplicates(arr));
//        print(arr);
    }
}
