public class Count_set_bits {
    public static void main(String[] args) {
        System.out.println(solve(15));
    }

    public static int solve(int n)
    {
        int count = 0;
        while(n > 0)
        {
            if((n&1) != 0)
            {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
