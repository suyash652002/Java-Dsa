package com.suyash;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Leaders {

    static ArrayList<Integer> leader(int [] arr)
    {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int currldr = arr[n-1];
        ans.add(currldr);
        for(int i = n-1; i>=0; i--)
        {
            if(arr[i] > currldr)
            {
                currldr = arr[i];
                ans.add(currldr);
            }
        }
        Collections.reverse(ans);
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans = leader(arr);
        System.out.println(ans);
    }
}
