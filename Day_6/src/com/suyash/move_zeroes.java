package com.suyash;

import java.util.Arrays;

public class move_zeroes {

     static int[] moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0; j<nums.length; j++)
        {
            if(nums[j] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] ans = moveZeroes(arr);
        System.out.println(Arrays.toString(ans));
    }

}
