package com.oop.groceryMart;

public class Grocery {
    private String customerName;
    private int customerID;
    private int customerPhone;
    private int customerAccBalance;
    private String customerAddress;

    public Grocery()
    {
        System.out.println("Default Constructor called");
    }
    public Grocery(String customerName, int customerID, int customerPhone, int customerAccBalance, String customerAddress)
    {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerPhone = customerPhone;
        this.customerAccBalance = customerAccBalance;
        this.customerAddress = customerAddress;
        System.out.println("Parameterized Constructor called");
    }
    public void setCustomer(String customerName, int customerID, int customerPhone, int customerAccBalance, String customerAddress)
    {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerPhone = customerPhone;
        this.customerAccBalance = customerAccBalance;
        this.customerAddress = customerAddress;
    }
    public void getCustomer()
    {
        System.out.println("Name : " + customerName);
        System.out.println("Id : " + customerID);
        System.out.println("Phone : " + customerPhone);
        System.out.println("Account Balance : " + customerAccBalance);
        System.out.println("Address : " + customerAddress);
    }

    public void Shop(int amount)
    {
        if(amount <= customerAccBalance)
        {
            int remBalance = customerAccBalance - amount;
            customerAccBalance = remBalance;
            System.out.println("Thanks for shopping! Your balance amount is " + customerAccBalance);
        }
        else
        {
            System.out.println("Your balance is " + customerAccBalance + ", add balance to shop!");
        }
    }
    public void AddBalance(int amount)
    {
        this.customerAccBalance += amount;
        System.out.println("Thanks for recharging! Your new balance is " + customerAccBalance);
    }
}

