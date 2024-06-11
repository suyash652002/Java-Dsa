public class NumberofRotations {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println(findKRotation(arr, arr.length));
    }
    static int findKRotation(int arr[], int n) {
        // code here
        int pivot = pivot(arr);
        if(pivot == -1) return 0;
        return pivot+1;
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
