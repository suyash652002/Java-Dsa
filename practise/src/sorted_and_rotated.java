public class sorted_and_rotated {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(find(arr));
    }
    public static boolean find(int[] arr)
    {
        int n = arr.length;
        int i;
        for(i = 1; i<n; i++)
        {
            if(arr[i] < arr[i-1])
            {
                break;
            }
        }
        if(i == n) return true;
        if(i != n-1 && arr[i]+1 != arr[i+1]) return false;
        return true;
    }
}
