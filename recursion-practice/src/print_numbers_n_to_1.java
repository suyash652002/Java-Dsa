public class print_numbers_n_to_1 {
    public static void main(String[] args) {
        print(10);
    }
    public static void print(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
}
