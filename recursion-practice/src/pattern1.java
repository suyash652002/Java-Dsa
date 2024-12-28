public class pattern1 {
    public static void main(String[] args) {
        solve(4, 0);
    }
    public static void solve(int r, int c)
    {
        if(r == 0) return;

        if(c<r)
        {
            System.out.print("* ");
            solve(r, c+1);
        }
        else{
            System.out.println();
            solve(r-1, 0);
        }
    }
}
