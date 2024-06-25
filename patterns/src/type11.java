public class type11 {
    public static void main(String[] args) {
//        1
//        0 1
//        1 0 1
        nBinaryTriangle(3);
    }
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        for(int i = 1; i<=n; i++)
        {
            if(i % 2 == 1)
            {
                for(int j = 1; j<=i; j++)
                {
                    if(j%2==1)
                    {
                        System.out.print(1);
                    }
                    else System.out.print(0);
                }
            }
            else
            {
                for(int j = 1; j<=i; j++)
                {
                    if(j%2==1) System.out.print(0);
                    else System.out.print(1);
                }
            }
            System.out.println("");
        }
    }
}
