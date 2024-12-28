public class print_numbers_1_to_n {
    public static void main(String[] args) {
        print(10);
    }
    public static void print(int n)
    {
        if(n == 0)
        {
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
}
