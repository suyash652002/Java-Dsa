public class Toggle_Ith_bit {
    public static void main(String[] args) {
        System.out.println(solve(13, 2));
    }

    public static int solve(int n, int i)
    {
        return n ^ (1 << i);
    }
}
