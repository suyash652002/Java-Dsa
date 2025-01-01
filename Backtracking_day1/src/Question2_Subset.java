import java.util.ArrayList;

public class Question2_Subset {

    public static void main(String[] args) {
        subset("abc", "");
        System.out.println(subset1("abc", ""));
    }
    public static void subset(String str, String ans)
    {
        if(str.isEmpty())
        {
            System.out.print(ans+" ");
            return;
        }
        char ch = str.charAt(0);
        subset(str.substring(1), ans+ch);
        subset(str.substring(1), ans);
    }
    public static ArrayList<String> subset1(String str, String ans)
    {
        ArrayList<String> anslist = new ArrayList<>();
        if(str.isEmpty())
        {
            anslist.add(ans);
            return anslist;
        }
        char ch = str.charAt(0);
        ArrayList<String> ansfromleft = subset1(str.substring(1), ans+ch);
        ArrayList<String> ansfromright = subset1(str.substring(1), ans);
        anslist.addAll(ansfromleft);
        anslist.addAll(ansfromright);
        return anslist;
    }
}
