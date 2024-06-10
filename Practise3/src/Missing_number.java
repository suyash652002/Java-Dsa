public class Missing_number {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(sort(arr));
        print(arr);
    }
    public static void swap(int[] arr, int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    public static void print(int[] arr)
    {
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
    public static int sort(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            int correct = arr[i];
            if(arr[i]<n  &&  arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else i++;
        }
        for(int j = 0; j<n; j++)
        {
            if(arr[j] != j) return j;
        }
        return -1;
    }
}
