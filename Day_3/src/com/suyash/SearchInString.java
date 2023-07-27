package com.suyash;

public class SearchInString {
    static int search(String name, char target)
    {
        if(name.length()==0)
        {
            return -1;
        }
        for(int i = 0; i<name.length(); i++)
        {
            if(target == name.charAt(i))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String name = "Suyash";
        char target = 'u';
        System.out.println(search(name, target));
    }
}
