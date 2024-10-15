public class Q7_FirstOcc {
    public static int first(int[] arr, int key, int i)
    {
        if(arr[i] == key) return i;
        if(i == arr.length-1) return -1;
        return first(arr, key, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 6, 3, 1, 5, 2};
        System.out.println(first(arr, 8, 0));
    }
}
