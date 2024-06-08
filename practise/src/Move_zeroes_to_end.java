public class Move_zeroes_to_end {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        move(arr);
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void move(int[] arr)
    {
        int i = 0;
        for(int j = 0; j<arr.length; j++)
        {
            if(arr[j] != 0)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }
}
