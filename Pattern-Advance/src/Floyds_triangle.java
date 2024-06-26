public class Floyds_triangle {
    public static void main(String[] args) {
        solve(5);
    }
    public static void solve(int n)
    {
        int mark = 1;
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(mark++ + " ");
            }
            System.out.println("");
        }
    }
}
