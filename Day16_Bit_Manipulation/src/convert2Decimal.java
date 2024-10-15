public class convert2Decimal {
    public static void main(String[] args) {
        System.out.println(solve(1101));
    }
    public static int solve(int n)
    {
        int a = 1;
        int ans = 0;
        while(n!=0)
        {
            int num = n%2;
            ans += num * a;
            a *= 2;
            n /= 10;
        }
        return ans;
    }

}
