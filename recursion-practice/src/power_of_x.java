public class power_of_x {
    public static void main(String[] args) {
        // power of x
        // input - {2, 5} ,   o/p - 32

        System.out.println(solve(2, 5));
    }
    public static int solve(int n, int p)
    {
        if(p==0) return 1;
        return n* solve(n, p-1);
    }
}
