package com.oop;

public class Complex {
    private int a1;
    private int a2;
    private int b1;
    private int b2;

    public Complex(int a1, int b1, int a2, int b2)
    {
        this.a1 = a1;
        this.b1 = b1;
        this.a2 = a2;
        this.b2 = b2;
    }

    public void getDiff()
    {
        System.out.println("Difference = " + (a1-a2) + " + i" + (b1-b2));
    }
    public void getSum()
    {
        System.out.println("Sum = " + (a1+a2) + " + i" + (b1+b2));
    }
}
