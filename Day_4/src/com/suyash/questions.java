package com.suyash;

public class questions {

    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 5;

//        if(a > b && a > c)
//        {
//            System.out.println("a is greater!!!");
//        }
//        else if(b > a && b > c)
//        {
//            System.out.println("b is greater!!!");
//        }
//        else
//        {
//            System.out.println("c is greater");
//        }

        int maximum = a;

        if(b > maximum)
        {
            maximum = b;
        }
        else if(c > maximum)
        {
            maximum = c;
        }
        System.out.println(maximum);
    }
}
