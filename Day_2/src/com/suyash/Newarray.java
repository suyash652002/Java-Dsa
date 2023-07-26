package com.suyash;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class Newarray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [] arr = new int[4];

        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
//        for(int i = 0; i<arr.length; i++)
//        {
//            System.out.print(arr[i]+ " ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
