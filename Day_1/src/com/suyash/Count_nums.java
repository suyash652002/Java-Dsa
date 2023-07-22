package com.suyash;

public class Count_nums {
    public static void main(String[] args) {
        int n = 455652955;
        int count = 0;
        while(n>0)
        {
            int rem = n%10;
            if(rem == 5)
            {
                count++;
            }
            n = n/10;
        }
        System.out.print("Count of 5 is : "+ count);
    }
}
