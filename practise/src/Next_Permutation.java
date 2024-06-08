public class Next_Permutation {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        find(arr);
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void reverse(int[] arr, int s, int e)
    {
        while(s<e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void swap(int[] arr, int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }
    public static void find(int[] arr)
    {
//        int i, j;
        int idx = -1;
        int idx2 = -1;
        int n = arr.length;
        for(int i = n-2; i>=0; i--)
        {
            if(arr[i] < arr[i+1])
            {
                idx = i;
                break;
            }
        }
        if(idx == -1) reverse(arr, 0, n-1);

        for(int i = n-1; i>idx; i--)
        {
            if(arr[i] > arr[idx])
            {
                idx2 = i;
                break;
            }
        }
        swap(arr, idx, idx2);

        reverse(arr, idx+1, n-1);

    }
}
