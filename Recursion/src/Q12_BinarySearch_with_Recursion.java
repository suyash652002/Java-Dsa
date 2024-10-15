public class Q12_BinarySearch_with_Recursion {
    public static int binarySearch(int[] arr, int key, int s, int e)
    {
        if(s>e) return -1;
        int mid = s+ (e-s)/2;
        if(arr[mid] == key) return mid;
        if(arr[mid] < key) return binarySearch(arr, key, mid+1, e);
        return binarySearch(arr, key, s, mid-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7};
        System.out.println(binarySearch(arr, 4, 0, arr.length-1));
    }
}
