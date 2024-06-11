public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int s = 0;
        int e = arr.length-1;
        while(s<e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] != arr[mid-1] && arr[mid]!=arr[mid+1])
            {
                return arr[mid];
            }
            else if((mid%2==0 && arr[mid] == arr[mid+1]) || (mid%2==1 && arr[mid] == arr[mid-1]))
            {
                s = mid+1;

            }
            else e = mid-1;
        }
        return arr[s];
    }
}
