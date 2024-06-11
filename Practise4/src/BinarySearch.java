public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 15, 29};
        System.out.println(search(arr, 29));
    }
    public static int search(int[] arr, int key)
    {
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        while (s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] == key) return mid+1;
            else if(arr[mid] < key) s = mid+1;
            else e = mid-1;
        }
        return ans;
    }
}
