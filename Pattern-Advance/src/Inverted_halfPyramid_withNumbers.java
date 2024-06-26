public class Inverted_halfPyramid_withNumbers {
//            1 2 3 4 5
//            1 2 3 4
//            1 2 3
//            1 2
//            1
    public static void solve(int n)
    {
        for(int i = n; i>=1; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
