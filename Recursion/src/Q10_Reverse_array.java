import java.util.Arrays;

public class Q10_Reverse_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr, int s, int e){
        if(s>=e) return;

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        reverse(arr, s+1, e-1);
    }
}
