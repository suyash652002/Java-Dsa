public class Missing_number {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3};
        System.out.println(missing(arr));
    }
    public static int missing(int[] arr)
    {
        int n = arr.length;
        int sumofarr = 0;
        for(int i = 0; i<n; i++)
        {
            sumofarr += arr[i];
        }
        int actualsum = (n*(n+1))/2;

        return actualsum - sumofarr;
    }
}
