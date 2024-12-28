public class practise {
    public static void main(String[] args) {
        String name = "Suyash Sanjay Bhadgaonkar";
        solve(name);
    }
    public static void solve(String str)
    {
        for(int i = 0; i<str.length()-1;i++)
        {
            if(str.charAt(i) == ' ')
            {
                System.out.print(str.charAt(i+1));
            }
        }
    }
}
