public class Question7_N_Queens {
    public static void main(String[] args) {
        int n = 4;
        char[][] arr = new char[n][n];
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                arr[i][j] = '.';
            }
        }
        solve(arr, 0);
    }

    public static void solve(char[][] arr, int row)
    {

        if(row == arr.length)
        {
            printBoard(arr);
            return;
        }
        for(int j = 0; j<arr.length; j++)
        {
            if(isSafe(arr, row, j))
            {
                arr[row][j] = 'Q';
                solve(arr, row+1);
                arr[row][j] = '.';
            }

        }
    }

    public static boolean isSafe(char[][] arr, int row, int col)
    {
        // vertical upwards
        for(int i = row-1; i>=0; i--)
        {
            if(arr[i][col] == 'Q')
            {
                return false;
            }
        }

        for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--)
        {
            if(arr[i][j] == 'Q')
            {
                return false;
            }
        }
        for(int i = row-1, j = col+1; i>=0 && j<arr.length; i--, j++)
        {
            if(arr[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }
    public static void printBoard(char[][] arr)
    {
        System.out.println("----------Chess Board--------------");
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
