public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(floorSqrt(8));
    }
    static long floorSqrt(long x)
    {
        // Your code here
        long ans = -1;
        long s = 0;
        long e = x;
        while(s<=e)
        {
            long mid = s + (e-s)/2;
            if(mid * mid <= x)
            {
                ans = mid;
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
        }
        return ans;
    }
}
