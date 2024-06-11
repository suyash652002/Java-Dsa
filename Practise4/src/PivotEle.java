public class PivotEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(pivot(arr));
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
