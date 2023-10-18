package com.suyash;

import java.util.ArrayList;

public class Majority_Element2 {
    public static ArrayList<Integer> majority(int[] arr)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = arr.length;
        int count1 = 0;
        int count2 = 0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(count1 == 0 && arr[i]!=element2)
            {
                count1 = 1;
                element1 = arr[i];
            }
            else if(count2 == 0 && arr[i]!=element1)
            {
                count2 = 1;
                element2 = arr[i];
            }
            else if(arr[i] == element1) count1++;
            else if(arr[i] == element2) count2++;
            else
            {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i<n; i++)
        {
            if(arr[i] == element1) count1++;
            if(arr[i] == element2) count2++;
        }
        if(count1 > n/3) ans.add(element1);
        if(count2 > n/3) ans.add(element2);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(majority(arr));
    }
}
