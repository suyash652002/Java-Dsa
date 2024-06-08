public class Stock_Buy_Sell {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(find(arr));
    }
    public static int find(int[] arr)
    {
        int currmin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++)
        {
            currmin = Math.min(currmin, arr[i]);
            max = Math.max(max, arr[i] - currmin);
        }
        return max;
    }
//    public static int find(int[] arr)
//    {
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i<arr.length; i++)
//        {
//            for(int j = i; j<arr.length; j++)
//            {
//                if(arr[i] < arr[j])
//                {
//                    max = Math.max(max, arr[j] - arr[i]);
//                }
//
//            }
//        }
//        return max;
//    }
}
