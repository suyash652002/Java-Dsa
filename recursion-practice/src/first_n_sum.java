public class first_n_sum {
    public static void main(String[] args) {
        System.out.println(solve(5));
    }
    public static int solve(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+solve((n-1));
    }
}
