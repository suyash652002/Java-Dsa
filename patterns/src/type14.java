public class type14 {
    public static void main(String[] args) {
        nLetterTriangle(3);
    }
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println("");
        }
    }
}
