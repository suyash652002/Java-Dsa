public class max_subarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(max(arr));
    }
    public static int max(int[] arr)
    {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            currsum = Math.max(arr[i], arr[i]+currsum);
            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum;
    }
//    public static int max(int[] arr)
//    {
//        int maxsum = Integer.MIN_VALUE;
//        for(int i = 0; i<arr.length; i++)
//        {
//            int sum = 0;
//            for(int j = i; j<arr.length; j++)
//            {
//                sum += arr[j];
//                maxsum = Math.max(maxsum, sum);
//                if(sum < 0) sum = 0;
//            }
//        }
//        return maxsum;
//    }
}
