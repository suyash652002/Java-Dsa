public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {16, 12, 64, 1, 61, 6};
        sort(arr, arr.length-1, 0);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr, int r, int c)
    {
        if(r == 0) return;
        if(c<r)
        {
            if(arr[c] > arr[c+1])
            {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            sort(arr, r, c+1);
        }
        else
        {
            sort(arr, r-1, 0);
        }
    }
}
