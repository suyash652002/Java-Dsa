public class Power_of_2 {
    public static void main(String[] args) {
        System.out.println(solve(7));
    }

    public static String solve(int n)
    {
        if((n & n-1) == 0) return "Yes";
        return "No";
    }
}
