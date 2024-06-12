public class SmallestDivisor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9};
        System.out.println(smallestDivisor(arr, 6));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        if(threshold < nums.length) return -1;
        int s = 1;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            maxsum = Math.max(maxsum, nums[i]);
        }
        int e = maxsum;
        int ans = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int sum = sum(nums, mid);
            if(sum <= threshold)
            {
                ans = mid;
                e = mid - 1;
            }
            else s = mid + 1;
        }
        return ans;
    }
    public static int sum(int[] arr, int div)
    {
        int ans = 0;
        for(int i = 0; i<arr.length; i++)
        {
            ans += Math.ceil((double)arr[i]/(double)div);
        }
        return ans;
    }
}
