public class Kth_Bit_is_Set_or_Not {
    public static void main(String[] args) {
//        n = 4, k = 2
//        Output:
//        Yes
//        Explanation:
//        Binary representation of 4 is 100, in which 2nd index bit from LSB is set. So, return true.
        System.out.println(solve(4, 2));
    }
    public static String solve(int n, int k)
    {
        int bitmask = 1 << k;
        if((n & bitmask) == 0) return "No";
        return "Yes";
    }
}
