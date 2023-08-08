package com.suyash;

import java.util.Arrays;

public class Second_largest_ele {
    static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int first_maximum = Integer.MIN_VALUE;
        int first_minimum = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(a[i] > first_maximum)
            {
                first_maximum = a[i];
            }
            if(a[i] < first_minimum)
            {
                first_minimum = a[i];
            }
        }
        int second_maximum = Integer.MIN_VALUE;
        int second_minimum = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(a[i] > second_maximum && a[i] != first_maximum)
            {
                second_maximum = a[i];
            }
            if(a[i] < second_minimum && a[i] != first_minimum)
            {
                second_minimum = a[i];
            }
        }
        return new int[]{second_maximum, second_minimum};
    }
    public static void main(String[] args) {
        // write your code here
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = getSecondOrderElements(5, arr);
        System.out.println(Arrays.toString(ans));
    }
}
