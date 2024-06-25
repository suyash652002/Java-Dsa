public class type7 {
    public static void main(String[] args) {
//          *
//         ***
//        *****
        nStarTriangle(3);
    }
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n-i-1; j++)
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
