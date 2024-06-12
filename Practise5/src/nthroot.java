public class nthroot {
    public static void main(String[] args) {
        System.out.println(NthRoot(2, 9));
    }
    public static int multiply(int mid, int n, int m)
    {
        int ans = 1;
        for(int i = 1; i<=n; i++)
        {
            ans = ans * mid;
            if(ans > m) break;
        }
        return ans;
    }
    public static int NthRoot(int n, int m)
    {
        // code here
        int s = 1;
        int e = m;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int ans = multiply(mid, n, m);
            if(ans == m)
            {
                return mid;
            }
            else if(ans < m)
            {
                s = mid + 1;
            }
            else e = mid - 1;
        }
        return -1;
    }
}
