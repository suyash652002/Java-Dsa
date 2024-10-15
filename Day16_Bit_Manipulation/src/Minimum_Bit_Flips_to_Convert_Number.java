public class Minimum_Bit_Flips_to_Convert_Number {
    public static void main(String[] args) {
        int start = 10, goal = 7;
        System.out.println(minBitFlips(start, goal));
    }

    public static int minBitFlips(int start, int goal) {
        int temp = start ^ goal;
        int ans = countBits(temp);
        return ans;
    }
    public static int countBits(int n)
    {
        int count = 0;
        while(n!=0)
        {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

}
