public class Decimal2Binary {
    public static void main(String[] args) {
//        System.out.println(solve(13));
        toBinary(10);
    }
    public static int solve(int n)
    {
        int k = 0;
        while(n!=1)
        {
            k = k * 10 + n%2;
            n = n/ 2;
        }
        return k;
    }
    static void toBinary(int N) {
        //Write your code here
        StringBuilder ans = new StringBuilder("");
        while(N!=0)
        {
            if(N%2 == 1) ans.append(1);
            else ans.append(0);

            N /= 2;
        }
        ans.reverse();
        System.out.println(ans);
    }
}
