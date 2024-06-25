public class type6 {
    public static void main(String[] args) {
//        1 2 3
//        1 2
//        1
        nNumberTriangle(4);
    }
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i = n-1; i>=0; i--)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(j+1 + " ");
            }
            System.out.println("");
        }
    }
}
