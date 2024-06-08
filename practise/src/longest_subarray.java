public class longest_subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 3, 3};
        System.out.println(find(arr, 10));
    }
    public static int find(int[] arr, int k)
    {
        int left = 0;
        int right = 0;
        int n = arr.length;
        int length = Integer.MIN_VALUE;
        int sum = arr[0];
        while(right < n)
        {
            while(left <= right && sum>k)
            {
                sum-=arr[left];
                left++;
            }
            if(sum == k)
            {
                length = Math.max(length, right-left+1);
            }
            right++;
            if(right < n)
            {
                sum += arr[right];
            }
        }
        return length;
    }
}
