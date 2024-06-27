public class Even_odd {
    public static void main(String[] args) {
        System.out.println(even_odd(0));
    }
    public static String even_odd(int n)
    {
        if((n & 1) == 0) return "even";
        return "odd";
    }
}
