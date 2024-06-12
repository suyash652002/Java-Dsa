public class Ship_capacity {
    public static void main(String[] args) {
        int[] arr = {3,2,2,4,1,4};
        System.out.println(shipWithinDays(arr, 3));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i<weights.length; i++)
        {
            maxi = Math.max(maxi, weights[i]);
            sum += weights[i];
        }
        int s = maxi;
        int e = sum;
        int ans = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int noofdays = finddays(weights, mid);
            if(noofdays <= days)
            {
                ans = mid;
                e = mid - 1;
            }
            else s = mid + 1;
        }
        return ans;
    }
    public static int finddays(int[] arr, int cap)
    {
        int sum = 0;
        int days = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if((sum+ arr[i]) <= cap)
            {
                sum += arr[i];
            }
            else
            {
                days++;
                sum = arr[i];
            }
        }
        return days+1;
    }
}
