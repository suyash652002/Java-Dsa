import java.util.Arrays;

public class New {
    public static void main(String[] args) {
        String str = "abced";
        System.out.println(solve(str));
    }
    public static boolean solve(String str)
    {
        int pivot = pivot(str);
        if(pivot == -1) return true;
        boolean flag = true;
        for(int i = 0; i<pivot; i++)
        {
            if(str.charAt(i) < str.charAt(i+1)) continue;
            else flag = false;
        }
        if(flag == false) return false;
        else
        {
            for(int i = pivot + 1; i<str.length()-1; i++)
            {
                if(str.charAt(i) < str.charAt(i+1)) continue;
                else return false;
            }
        }
        return true;
    }
    public static int pivot(String str)
    {
        int s = 0;
        int e = str.length()-1;
        while(s<e)
        {
            int mid = (s +e)/2;
            if(mid + 1 <= e && str.charAt(mid) > str.charAt(mid+1) )
            {
                return mid;
            }
            else if(mid - 1 >= s && str.charAt(mid) < str.charAt(mid-1) )
            {
                return mid-1;
            }
            else if(str.charAt(mid) < str.charAt(s))
            {
                e = mid - 1;
            }
            else s = mid + 1;
        }
        return -1;
    }
}
