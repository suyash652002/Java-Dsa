public class Rotate_matrix_Clockwise {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(arr);
        print(arr);
    }
    public static void rotate(int[][] arr)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = i+1; j<arr[i].length; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            int low = 0;
            int high = arr[i].length-1;
            while(low < high)
            {
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                high--;
                low++;
            }
        }
    }
    public static void print(int[][] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                System.out.print((arr[i][j]+ " "));
            }
            System.out.println("");
        }
    }
}
