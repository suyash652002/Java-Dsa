public class type15 {
    public static void main(String[] args) {
        nLetterTriangle(3);
    }
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i = n-1; i>=0; i--)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println("");
        }
    }
}
