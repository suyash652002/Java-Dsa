import java.util.Arrays;

public class rearrange_elements_by_sign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(find(arr)));
    }
    public static int[] find(int[] arr)
    {
        int pos = 0;
        int neg = 1;
        int[] ans = new int[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] >=0)
            {
                ans[pos] = arr[i];
                pos += 2;
            }
            else
            {
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }
}
