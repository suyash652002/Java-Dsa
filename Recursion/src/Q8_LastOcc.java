public class Q8_LastOcc {
    public static int last(int[] arr, int key, int i)
    {
        if(arr[i] == key) return i;
        if(i == 0) return -1;
        return last(arr, key, i-1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 6, 3, 1, 5, 2};
        System.out.println(last(arr, 5, arr.length-1));
    }
}
