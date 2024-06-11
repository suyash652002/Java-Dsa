public class SearchIn_rotatedsorted2 {
    public static void main(String[] args) {
        int[] arr = {6,0,0,1,6};
        System.out.println(pivot(arr));
    }
    public static int pivot(int[] arr)
    {
        int s= 0;
        int e = arr.length-1;
        while(s<e)
        {
            int mid = s + (e-s)/2;
            if(mid-1 > s && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            else if(mid+1 < e && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid] == arr[s] && arr[mid] == arr[e])
            {
                if(arr[s] > arr[s+1]) return arr[s];
                s++;
                if(arr[e] < arr[e-1]) return arr[e-1];

                e--;
            }
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
