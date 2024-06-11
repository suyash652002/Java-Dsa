public class First_Occ {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        System.out.println(firstocc(arr, 8));
    }
    public static int firstocc(int[] arr, int target)
    {
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        while (s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] == target)
            {
                ans = mid;
                e = mid - 1;
            }
            else if(arr[mid] < target) s = mid+1;
            else e = mid-1;
        }
        return ans;
    }
}
