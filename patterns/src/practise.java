public class practise {
    public static void main(String[] args) {
        symmetry(3);
    }
    public static void symmetry(int n) {
        // Write your code here
        for(int i = 0; i<n; i++)
        {
            for(int j = n-1; j>=i; j--)
            {
                System.out.print("*");
            }
            for(int j = 0; j< (n*i+i)/2; j++)
            {
                System.out.print("_");
            }
            for(int j = 0; j<n-i; j++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
