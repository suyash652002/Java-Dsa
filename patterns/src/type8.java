public class type8 {
    public static void main(String[] args) {
        nStarTriangle(3);
    }
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = n-1; i>=0; i--)
        {
            for(int j = 0; j< n-1-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j<=i*2; j++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
