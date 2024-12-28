public class Q1_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        System.out.println(lsearch(arr, 9, 0));
    }
    static int lsearch(int[] arr, int key, int i)
    {
        if(i==arr.length) return -1;
        if(arr[i] == key) return i;
        return lsearch(arr, key, i+1);
    }
}
