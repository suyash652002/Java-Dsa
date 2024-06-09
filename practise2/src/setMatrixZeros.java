public class setMatrixZeros {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 0, 0, 1}
        };
        setMatrix(arr, 4, 4);
        print(arr);
    }
    public static void setMatrix(int[][] arr, int n, int m)
    {
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                if(arr[i][j] == 0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                if(row[i] == 1 || col[j] == 1)
                {
                    arr[i][j] = 0;
                }
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
