package com.suyash;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int colors = in.nextInt();

        switch (colors) {
            case 1:
                System.out.println("black");
                break;
            case 2:
                System.out.println("blue");
                break;
            case 3:
                System.out.println("red");
                break;
            default:
                System.out.println("no color");
        }

    }
}
