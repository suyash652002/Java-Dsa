public class type13 {
//            1
//            2 3
//            4 5 6
public static void main(String[] args) {
    nNumberTriangle(3);
}
    public static void nNumberTriangle(int n) {
        // Write your code here
        int mark = 1;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(mark + " ");
                mark++;
            }
            System.out.println("");
        }
    }
}
