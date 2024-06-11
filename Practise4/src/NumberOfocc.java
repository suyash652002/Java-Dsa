public class NumberOfocc {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(count(arr, arr.length, 1));
    }
    public static int count(int[] arr, int n, int x) {
        // code here
        int first = firstocc(arr, x);
        if(first == -1) return 0;
        int last = lastocc(arr, x);
        return last - first + 1;
    }
    public static int firstocc(int[] arr, int target)
    {
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        while (s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] == target)
            {
                ans = mid;
                e = mid - 1;
            }
            else if(arr[mid] < target) s = mid+1;
            else e = mid-1;
        }
        return ans;
    }
    public static int lastocc(int[] arr, int target)
    {
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        while (s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] == target)
            {
                ans = mid;
                s = mid + 1;
            }
            else if(arr[mid] < target) s = mid+1;
            else e = mid-1;
        }
        return ans;
    }
}
