package com.suyash;

import java.util.ArrayList;

public class InsertioninArrays {
    public static ArrayList<Integer> insert(ArrayList<Integer> arr, int k, int position)
    {
        int n = arr.size();
        for(int i = n-1; i>position; i--)
        {
            arr.set(i, arr.get(i-1));
        }
        arr.set(position, k);
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(10);
        arr.add(20);
        arr.add(0);
        // add 15 at position 2
        ArrayList<Integer> ans = insert(arr, 15, 2);
        System.out.println(ans);
    }
}
