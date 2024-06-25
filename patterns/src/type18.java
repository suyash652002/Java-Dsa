public class type18 {
    public static void main(String[] args) {
//        C
//        C B
//        C B A
        alphaTriangle(4);
    }
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i = n-1; i>=0; i--)
        {
            int mark = n-1;
            for(int j = 0; j<n-i; j++)
            {
                System.out.print((char) ('A' + mark) + " ");
                mark--;
            }

            System.out.println("");
        }
    }
}
