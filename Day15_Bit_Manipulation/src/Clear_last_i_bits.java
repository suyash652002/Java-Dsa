public class Clear_last_i_bits {
    public static void main(String[] args) {
        System.out.println(solve(15, 2));
    }
    public static int solve(int n, int k)
    {
        int bitmask = (~0) << k;
        return (n & bitmask);
    }
}
