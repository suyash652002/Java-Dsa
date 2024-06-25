public class type17 {
    public static void main(String[] args) {
//            A
//          A B A
//        A B C B A
        alphaHill(3);
    }
    public static void alphaHill(int n) {
        // Write your code here
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print("  ");
            }
            for(int j = 0; j<=i; j++)
            {
                System.out.print((char)('A' + j) + " ");
            }
            for(int j = i-1; j>=0; j--)
            {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println("");
        }
    }
}
