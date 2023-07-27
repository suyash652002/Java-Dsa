package com.suyash;
// find no. of elements in array which are even
public class Even_digits {
    public static void main(String[] args) {
        int[] nums = {23, 421, 302, 1939, 92929};
        int ans = find_no(nums);
        System.out.println(ans);

    }
    static int find_no(int[] nums)
    {
        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(even(nums[i]))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even(int nums)
    {
        int numberofdigits = digit(nums);
        if(numberofdigits % 2 == 0)
        {
            return true;
        }
        return false;
    }

    static int digit(int nums)
    {
        int count = 0;
        if (nums < 0)
        {
            nums = nums * -1;
        }
        if (nums == 0)
        {
            return 1;
        }
        while(nums > 0)
        {
            count++;
            nums = nums/10;
        }
        return count;
    }

}
