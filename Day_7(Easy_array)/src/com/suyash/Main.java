package com.suyash;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList <Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Collections.reverse(list);
        System.out.println(list);
    }
}
