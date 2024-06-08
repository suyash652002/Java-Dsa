public class BinarySearch_recursion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 9};
        int key = 9;
        System.out.println(binarySearch(arr, key, 0, arr.length-1));

    }
    public static int binarySearch(int[] arr, int key, int s, int e)
    {
        if(s>e) return -1;
        int mid = s + (e-s)/2;

        if(arr[mid] == key) return mid;

        if(arr[mid] > key) return binarySearch(arr, key, 0, mid-1);
        return binarySearch(arr, key, mid+1, e);
    }
}
