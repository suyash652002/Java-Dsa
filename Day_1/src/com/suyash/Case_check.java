package com.suyash;

import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <='z')
        {
            System.out.println("LowerCase!");
        }
        else
        {
            System.out.println("UpperCase!");
        }
    }
}
