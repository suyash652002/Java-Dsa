public class Remove_entire_word {
    public static void main(String[] args) {
        String fruit = "apple";
        String name = "Suyash apple is a day keeps a doctor away";
        remove(name, "");
//        System.out.println(name.startsWith(fruit));
    }
    public static String remove(String str)
    {
        if(str.isEmpty()) return "";
        if(str.startsWith("apple"))
        {
            return remove(str.substring(5));
        }
        return str.charAt(0) + remove(str.substring(1));
    }
    public static void remove(String str, String ans)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        if(str.startsWith("apple"))
        {
            remove(str.substring(5), ans);
        }
        else {
            ans += str.charAt(0);
            remove(str.substring(1),ans);
        }
    }
}
