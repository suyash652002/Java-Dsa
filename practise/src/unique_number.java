public class unique_number {
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 2, 2, 4, 6};
        System.out.println(optunique(arr));
    }

    public static int optunique(int[] arr)
    {
        int res = 0;
        for(int i = 0; i<arr.length; i++)
        {
            res = res ^ arr[i];
        }
        return res;
    }

}
