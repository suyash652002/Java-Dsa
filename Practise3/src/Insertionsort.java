public class Insertionsort {
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
            for(int j = i+1; j>0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
                else break;
            }
        }
    }
}
