public class Split_Array_Largest_Sum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr, 2));
    }
    public static int splitArray(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : nums)
        {
            maxi = Math.max(maxi, i);
            sum += i;
        }
        int s = maxi;
        int e = sum;
        int ans = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int noofks = kcount(nums, mid);
            if(noofks <= k)
            {
                ans = mid;
                e = mid - 1;
            }
            else s = mid + 1;
        }
        return ans;
    }
    public static int kcount(int[] arr, int cap)
    {
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if((arr[i] + sum) > cap)
            {
                cnt++;
                sum = arr[i];
            }
            else sum += arr[i];
        }
        return cnt+1;
    }
}
