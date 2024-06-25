public class type22 {
    public static void main(String[] args) {
        getNumberPattern(4);
    }
    public static void getNumberPattern(int n) {
        // Write your code here.
        for(int i = 0; i>=0; i++)
        {
            for(int j = 1; j<= n; j++)
            {
                System.out.print(n-i);
            }
            System.out.println("");
        }
    }
}
