public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9};
        System.out.println(count(arr, 3));
    }
    public static int count(int[] arr, int cap)
    {
        int cnt = 1;
        int ele = arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            if(Math.abs(arr[i] - ele) >= cap)
            {
                cnt++;
                ele = arr[i];
            }
        }
        return cnt;
    }
}
