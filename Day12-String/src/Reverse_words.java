import java.util.*;
public class Reverse_words {
    public static void main(String[] args) {
        String name = "a.good.example";
//        System.out.println((reverse2(name)));
        System.out.println((reverse2(name)));
    }
    public static String reverse(String str)
    {
        String[] name = str.split("\\s+");
        String res = "";
        for(int i = name.length-1; i>=0; i--)
        {
            if(i!=0)
            {
                res+=name[i];
                res+=" ";
            }
        }
        res+=name[0];
        return res;
    }
    public static String reverse2(String str)
    {
        String[] name = str.split("\\.");
        String res = "";
        for(int i = name.length-1; i>=0; i--)
        {
            if(i!=0)
            {
                res+=name[i];
                res+=".";
            }
        }
        res+=name[0];
        return res;
    }

}
