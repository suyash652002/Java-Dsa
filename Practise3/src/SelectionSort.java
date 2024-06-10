public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 10};
        sort(arr);
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
    public static void sort(int[] arr)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            int minindex = i;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[i])
                {
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }
}
