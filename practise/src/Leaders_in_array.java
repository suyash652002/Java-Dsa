public class Leaders_in_array {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        leaders(arr);
    }
    public static void leaders(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            boolean flag = true;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] <= arr[j])
                    flag = false;
            }
            if(flag == true) System.out.println(arr[i]);
        }
    }
}
