public class type21 {
    public static void main(String[] args) {
        getStarPattern(4);
    }
    public static void getStarPattern(int n) {
        // Write your code here
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                if(j == 1 || j == n  || i == 1 || i == n)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
