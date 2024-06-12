public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        System.out.println(minEatingSpeed(arr, 8));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<piles.length; i++)
        {
            maxsum = Math.max(maxsum, piles[i]);
        }
        int e = maxsum;
        int ans = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int minhr = ans(piles, mid, h);
            if(minhr<=h)
            {
                ans = mid;
                e = mid-1;
            }
            else s = mid+1;
        }
        return ans;
    }
    public static int ans(int[] arr, int mid, int h)
    {
        int minhr = 0;
        for(int i = 0; i<arr.length; i++)
        {
            minhr += Math.ceil((double)arr[i] / (double)mid);
        }
        return minhr;
    }
}
