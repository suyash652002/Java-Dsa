public class type4 {
//            1
//            2 2
//            3 3 3
public static void main(String[] args) {
    nTriangle(3);
}
public static void nTriangle(int n) {
    // Write your code here
    for(int i = 0; i<n; i++)
    {
        for(int j = 0; j<=i; j++)
        {
            System.out.print(i+1 + " ");
        }
        System.out.println("");
    }
}
}
