public class Hollow_Rhombus {
    public static void main(String[] args) {

        solve(5);
    }
    public static void solve(int n)
    {
        for(int i = n; i>=1; i--)
        {
            for(int j = 1; j<i; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j<=n; j++)
            {
                if(i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print("* ");

                }
                else System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
