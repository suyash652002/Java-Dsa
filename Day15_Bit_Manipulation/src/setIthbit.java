public class setIthbit {
    public static void main(String[] args) {
        System.out.println(solve(10, 2));
    }
    public static int solve(int n, int k)
    {
        int bitmask = 1 << k;
        return (n | bitmask);
    }
}
