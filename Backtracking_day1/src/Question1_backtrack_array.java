import java.util.Arrays;

public class Question1_backtrack_array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        solve(arr, 0);
        System.out.println("After Backtracking");
        System.out.println(Arrays.toString(arr));
    }

    public static void solve(int[] arr, int i)
    {
        if(i == arr.length)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i] = i+1;
         solve(arr, i+1);
        arr[i] = arr[i]-2;
    }
}
