public class type12 {
    public static void main(String[] args) {
//        1         1
//        1 2     2 1
//        1 2 3 3 2 1
        numberCrown(4);
    }
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(j+1 +" ");
            }
            for(int j = 1; j<=(n+n)-2-(i*2); j++)
            {
                System.out.print(" " +" ");
            }
            for(int j = i+1; j>0; j--)
            {
                System.out.print(j +" ");
            }
            System.out.println("");
        }
    }
}
