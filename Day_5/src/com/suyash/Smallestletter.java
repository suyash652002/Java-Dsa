package com.suyash;

public class Smallestletter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int s = 0, e = letters.length-1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(target < letters[mid])
            {
                e = mid - 1;
            }
            else
            {
                s = mid + 1;
            }
        }
        return letters[s % letters.length];
    }

    public static void main(String[] args) {
       char[] letters = {'c','f','j'};
       char target = 'j';
       char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

}
