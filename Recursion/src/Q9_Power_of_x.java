public class Q9_Power_of_x {
    public static int power(int x, int n)
    {
        if(n == 0)return 1;
        return x*power(x, n-1);
    }
    public static double myPow(double x, int n) {
        if(n==0) return 1;
        return x * myPow(x, n-1);
    }

    public static void main(String[] args) {
//        System.out.println(power(2, 5));
        System.out.println(myPow(2, 10));
    }

}
