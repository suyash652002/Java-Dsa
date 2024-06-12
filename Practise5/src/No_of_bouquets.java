public class No_of_bouquets {
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,12,7,7};
        System.out.println(minDays(arr, 2, 3));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        if((m*k)>bloomDay.length) return -1;
        int s = 1;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<bloomDay.length; i++)
        {
            maxsum = Math.max(maxsum, bloomDay[i]);
        }
        int e = maxsum;
        int ans = -1;

        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int noofB = ans(bloomDay, mid, k);
            if(noofB >= m)
            {
                ans = mid;
                e = mid - 1;
            }
            else s = mid + 1;
        }
        return ans;
    }
    public static int ans(int[] arr, int days, int k)
    {
        int count = 0;
        int noofB = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] <= days)
            {
                count++;
            }
            else
            {
                noofB += count/k;
                count = 0;
            }
        }
        noofB += count/k;
        return noofB;
    }
}
