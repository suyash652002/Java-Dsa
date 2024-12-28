public class check_array_sort {
    public static void main(String[] args) {
        int[] arr = {2,34, 12, 1, 63};
        int[] arr2 = {3, 5, 6, 7, 8};
        System.out.println(check(arr2, 0));

    }
    public static boolean check(int[] arr, int i)
    {
        if(i==arr.length-1) return true;
        if(arr[i] > arr[i+1]) return false;
        return check(arr, i+1);
    }
}
