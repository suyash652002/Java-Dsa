package com.oop;

public class Newcell {
    private int Ram;
    private int NoOfCameras;
    private String model;
    private String color;
    private String processor;

    public void setName(String model, String color, int Ram){
        this.model = model;
        this.color = color;
        this.Ram = Ram;
    }
    public void getName()
    {
        System.out.println("The model is "+ model + ", color is " + color + " and Ram is " + Ram + " gb");
    }
};
