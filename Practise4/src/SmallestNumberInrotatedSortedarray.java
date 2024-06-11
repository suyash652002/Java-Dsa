public class SmallestNumberInrotatedSortedarray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        int pivot = pivot(nums);
        return nums[pivot+1];
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
            else if(arr[mid] < arr[0])
            {
                e = mid - 1;
            }
            else s = mid + 1;
        }
        return -1;
    }

}
