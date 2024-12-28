public class Patterns_using_recursion {
    public static void main(String[] args) {
//        System.out.println();
//        print(4, 4);
        print2(4, 0);
    }
    static void print2(int r, int c)
    {
        if(r == 0) return;
        if(c<r)
        {
            System.out.print("* ");
            print2(r, c+1);
        }
        else
        {
            System.out.println("");
            print2(r-1, 0);
        }
    }
    static void print(int n)
    {
        if(n==0) return ;
        for(int i = 1; i<=n; i++)
        {
            System.out.print("* ");
        }
        System.out.println("");
        print(n-1);
    }
    static void print(int r, int c)
    {
        if(r==0) return;
        for(int i = 0; i<c; i++)
        {
            System.out.print("* ");
        }
        System.out.println("");
        print(r-1, c-1);
    }
}
