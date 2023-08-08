package com.suyash;

public class removeDuplicates {

    static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j<nums.length - 1; j++)
        {
            if(nums[j] != nums[j+1])
            {
                i++;
                nums[i] = nums[j+1];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int ans = removeDuplicates(arr);
        System.out.println((ans));
    }
}
