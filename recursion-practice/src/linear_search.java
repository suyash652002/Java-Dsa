public class linear_search {
    public static void main(String[] args) {
        int[] arr = {32, 53, 23, 6, 12, 72, 16};
        int key = 99;
        System.out.println(search(arr, key, 0));
    }
    public static int search(int[] arr, int key, int i)
    {
        if(arr[i] == key) return i;
        if(i == arr.length-1) return -1;
        return search(arr, key, i+1);
    }
}
