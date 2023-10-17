package com.suyash;

public class rotate_Image {
    public static void righttrotate(int[][] arr)
    {
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = row+1; col < arr[row].length; col++)
            {
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }

        for(int i = 0; i<arr.length; i++)
        {
            int low = 0;
            int high = arr[i].length-1;
            while(low<high)
            {
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++;
                high--;
            }
        }

    }

    public static void leftrotate(int[][] arr)
    {
        for(int i = 0; i< arr.length; i++)
        {
            int low = 0;
            int high = arr[i].length-1;
            while(low<high)
            {
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++;
                high--;
            }
        }
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = row+1; col < arr[row].length; col++)
            {
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
    }
    public static void print(int[][] arr)
    {
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        leftrotate(arr);
        print(arr);
    }
}
