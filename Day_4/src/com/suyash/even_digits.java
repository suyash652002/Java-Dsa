package com.suyash;

public class even_digits {

    public static boolean evenCount(int n)
    {
        int count = 0;
        int k = n;
        while(k!=0)
        {
            k/=10;
            count++;
        }
        if(count%2==0)
        {
            return true;
        }
        return false;
    }
    public static int find(int[] arr)
    {
        int count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(evenCount(arr[i]))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 21, 453, 1221, 92929, 12, 9832, 1000};
        int ans = find(arr);
        System.out.println(ans);
    }

}
