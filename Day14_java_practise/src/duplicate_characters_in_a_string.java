import java.util.Arrays;

public class duplicate_characters_in_a_string {
    public static void main(String[] args) {
        duplicate();
    }
    public static void duplicate()
    {
        String s = "geeksforgeeks";
        int[] count = new int[130];
        for(int i = 0; i<s.length(); i++)
        {
            count[s.charAt(i)]++;
        }
        for(int i = 0; i<count.length; i++)
        {
            if(count[i] > 1)
            {
                System.out.println((char)i + ", count = " + count[i]);
            }
        }
    }
}
