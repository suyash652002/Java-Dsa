public class Max_consecutive_ones {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(max(arr));

    }
    public static int max(int[] arr)
    {
        int count = 0;
        int maxcount = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == 1) count++;
            maxcount = Math.max(maxcount, count);
            if(arr[i] != 1) count = 0;
        }
        return maxcount;
    }
}
