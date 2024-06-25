public class type5 {
    public static void main(String[] args) {
//        * * *
//        * *
//        *
        seeding(5);
    }
    public static void seeding(int n) {
        // Write your code here
        for(int i = n-1; i>=0; i--)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
