package com.suyash;

public class functions {

    static void Add(int c, int d)  // void function does not return any value
    {
        int sum = c + d;
        System.out.println("Addition of two numbers is : " + sum);
    }

    static int Sum(int a, int b) // while other functions must return a value
    {
        int sum = a + b;
        return sum;


    }
//    static boolean even(int n)
//    {
//        if(n%2==0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }

    public static void main(String[] args) {
        int a = 10;
        int b = 4;
//        Add(3, 6);
//
//        int e = 12;
//        int f = 8;
//        Add(f, e);
//        Add(a, b);

        int ans = Sum(4, 5);
        System.out.println(ans);


        int answer = Sum(2,3);
        System.out.println(answer);

        String name = "Suyash";
        greet(name);

        greet("Sanjana");

    }
    static void greet(String name)
    {
        System.out.println("Hello "+ name);
    }
}
