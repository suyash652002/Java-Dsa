public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        sort(arr);
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
    public static void sort(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            int correct = arr[i]-1;
            if((arr[i] != arr[correct]))
            {
                swap(arr, i, correct);
            }
            else i++;
        }

    }
}
