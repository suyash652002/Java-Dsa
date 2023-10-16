package com.suyash;

import java.util.ArrayList;

public class deletionArray {
    public static ArrayList<Integer> deletion(ArrayList<Integer> arr, int position)
    {
        int n = arr.size();
        for(int i = position; i<n-1; i++)
        {
            arr.set(i, arr.get(i+1));
        }
        arr.remove(n-1);
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(8);
        arr.add(12);
        arr.add(5);
        arr.add(6);
        ArrayList<Integer> ans = deletion(arr, 2);
        System.out.println(ans);
    }
}
