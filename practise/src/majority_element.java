public class majority_element {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majority(arr));
    }
    public static int majority(int[] arr)
    {
        int count = 0;
        int ele = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(count == 0)
            {
                count = 1;
                ele = arr[i];
            }
            else if(arr[i] == ele) count++;
            else count--;
        }
        count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == ele) count++;
        }
        if(count > arr.length/2) return ele;
        return -1;
    }
//    public static int majority(int[] arr)
//    {
//        int n = arr.length;
//
//        for(int i = 0; i<n; i++)
//        {
//            int count = 0;
//            for(int j = 0; j<n; j++)
//            {
//                if(arr[i] == arr[j]) count++;
//            }
//            if(count > (n/2)) return arr[i];
//        }
//        return -1;
//    }
}
