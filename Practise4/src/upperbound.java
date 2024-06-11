import java.util.Arrays;

public class upperbound {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
        System.out.println(upper(arr, 7));
    }
    public static int upper(int[] arr, int x)
    {
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s<=e)
        {
              int mid = s + (e-s)/2;
              if(arr[mid] >= x)
              {
                  ans = arr[mid];
                  e = mid - 1;
              }
              else
              {
                  s = mid + 1;
              }
        }
        return ans;
    }
}
