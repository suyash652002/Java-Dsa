package com.suyash;

import java.util.Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9, 10}
                 };
//        for(int i = 0; i<arr.length; i++)
//        {
//            for(int j = 0; j<arr[i].length; j++)
//            {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println("");
//        }

        for (int i = 0; i<arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
