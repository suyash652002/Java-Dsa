public class Hollow_Rectangle {
    public static void main(String[] args) {
        solve(3);
    }
    public static void solve(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n+1; j++)
            {
                if(i==1 || i==n || j==1 || j==n+1)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");

            }
            System.out.println("");
        }
    }
}
