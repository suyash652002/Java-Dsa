public class type10 {
    public static void main(String[] args) {
        nStarTriangle(4);
    }
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = n-1; i>0; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
