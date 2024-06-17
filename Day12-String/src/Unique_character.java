public class Unique_character {
    public static void main(String[] args) {
        String str = "aabb";
        System.out.println(solve(str));
    }
    public static int solve(String str)
    {
        int[] count = new int[130];
        for(int i = 0; i<str.length(); i++)
        {
            count[str.charAt(i)]++;
        }
        for(int i = 0; i<str.length(); i++)
        {
            if(count[str.charAt(i)] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
