package com.suyash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetMismatch {
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
                ans.add(j+1);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(duplicates(arr));
    }
}
