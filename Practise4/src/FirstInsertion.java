public class FirstInsertion {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 5));
    }
    public static int searchInsert(int[] arr, int x) {
        if(x > arr[arr.length-1]) return arr.length;

        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] >= x)
            {
                ans = mid;
                e = mid - 1;
            }
            else
            {
                s = mid + 1;
            }
        }
        return ans;

    }
}
