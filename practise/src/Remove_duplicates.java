public class Remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 3, 3, 3, 5};
        System.out.println(remove_duplicate(arr));

    }
    public static int remove_duplicate(int[] arr)
    {
        int i = 0;
        for(int j = 0; j<arr.length; j++)
        {
            if(arr[i]!=arr[j])

            {
                i++;
                arr[i] = arr[j];
            }
        }
        for(int k = 0; k<=i; k++)
        {
            System.out.println(arr[k]);
        }
       return i+1;
    }
}
