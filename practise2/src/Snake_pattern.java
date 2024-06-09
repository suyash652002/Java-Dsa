public class Snake_pattern {
    public static void main(String[] args) {
        int[][] arr = {
                {45, 48, 54},
                {21, 89, 87},
                {70, 78, 15}
        };
        find(arr);
    }
    public static void find(int[][] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(i%2!=0)
            {
                for(int j = arr[i].length-1; j>=0; j--)
                {
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println("");
            }
            if(i%2==0)
            {
                for(int j = 0; j<arr[i].length; j++)
                {
                    System.out.print((arr[i][j]+ " "));
                }
                System.out.println("");
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
