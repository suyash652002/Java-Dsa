package com.oop.Inheritance;

public class Bicycle {
    private int gear;
    private int speed;

    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decreament)
    {
        speed -= decreament;
        System.out.println("Speed decreased to " + speed);
    }
    public void speedUp(int increament)
    {
        speed += increament;
        System.out.println("Speed increased to " + speed);
    }
    public String toString()
    {
        return ("No of gears are " + gear + " \n" + "speed of bicycle is " + speed);
    }
}
