public class sort012 {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sort(arr);
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void swap(int[] arr, int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    public static void sort(int[] arr)
    {
        int left = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high)
        {
            if(arr[mid] == 0)
            {
                swap(arr, mid, left);
                left++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(arr, mid, high);
                high--;
            }
        }
    }
//    public static void sort(int[] arr)
//    {
//        int count0 = 0;
//        int count1 = 0;
//        int count2 = 0;
//        for(int i = 0; i<arr.length; i++)
//        {
//            if(arr[i] == 0) count0++;
//            else if(arr[i] == 1) count1++;
//            else count2++;
//        }
//        int index = 0;
//        for(int i = 0; i<count0; i++)
//        {
//            arr[index] = 0;
//            index++;
//        }
//        for(int i = count0; i<count0+count1; i++)
//        {
//            arr[index] = 1;
//            index++;
//        }
//        for(int i = count0+count1; i<arr.length; i++)
//        {
//            arr[index] = 2;
//            index++;
//        }
//    }
}
