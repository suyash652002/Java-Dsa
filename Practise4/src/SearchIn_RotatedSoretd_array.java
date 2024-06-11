public class SearchIn_RotatedSoretd_array {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 0));
    }
    public static int search(int[] arr, int target)
    {
        int pivot = pivot(arr);
        if(arr[pivot] == target) return pivot;
        else if(pivot == -1) binarySearch(arr, target, 0, arr.length-1);
        int ans = -1;
        if(target>= arr[0] && target<=arr[pivot])
        {
             ans =  binarySearch(arr, target, 0, pivot);
        }
        else {
            ans =  binarySearch(arr, target, pivot+1, arr.length-1);
        }
        return ans;

    }
    public static int pivot(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;
        while(s<e)
        {
            int mid = (s +e)/2;
            if(mid + 1 <= e && arr[mid] > arr[mid+1] )
            {
                return mid;
            }
            else if(mid - 1 >= s && arr[mid] < arr[mid-1]  )
            {
                return mid-1;
            }
            else if(arr[mid] < arr[s])
            {
                e = mid - 1;
            }
            else s = mid + 1;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target, int s, int e)
    {
        while (s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target) s = mid+1;
            else e = mid-1;
        }
        return -1;
    }
}
