package com.oop.Inheritance;

public class MountainBike extends Bicycle{
    private int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight)
    {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    public void setHeight(int newHeight)
    {
        seatHeight = newHeight;
        System.out.println("Height update! \n Seat heigt : " + seatHeight);
    }
    @Override
    public String toString()
    {
        return(super.toString() + "\n Seat Height is " + seatHeight);
    }

}
