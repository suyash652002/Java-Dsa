public class Roman_to_Integers {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int ans = 0;
        for(int i = 0; i<s.length()-1; i++)
        {
            int nextint = getval(s.charAt(i+1));
            int currint = getval(s.charAt(i));
            if(currint >= nextint)
            {
                ans += currint;
            }
            else ans -= currint;
        }
        ans += getval(s.charAt(s.length()-1));
        return ans;
    }

    public static int getval(char ch)
    {
        switch (ch)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }
}
