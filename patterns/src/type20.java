public class type20 {
    public static void main(String[] args) {
        symmetry(5);
    }
    public static void symmetry(int n) {
        // Write your code here
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j<=(n+n)-2-i*2; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = n-2; i>=0; i--)
        {
            for(int j = 1; j<=i+1; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j<=(n+n)-2-i*2; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
