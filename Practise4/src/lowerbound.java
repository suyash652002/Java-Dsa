public class lowerbound {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,11,12,19};
        System.out.println(find(arr, 5));
    }
    public static int find(int[] arr, int x)
    {
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] > x)
            {
                e = mid-1;
            }
            else if(arr[mid]<=x)
            {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
}
