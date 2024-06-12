public class Book_Allocation {
    public static void main(String[] args) {
        int[] arr = {12,34,67,90};
        System.out.println(findPages(arr, arr.length, 2));
    }
    public static int countstudents(int[] arr, int capacity)
    {
        int students = 0;
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(sum+arr[i] > capacity)
            {
                students++;
                sum = arr[i];
            }
            else
            {
                sum += arr[i];
            }
        }
        return students+1;
    }
    public static int findPages(int[]A,int N,int M)
    {
        if(N<M) return -1;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<A.length; i++)
        {
            maxi = Math.max(maxi, A[i]);
            sum += A[i];
        }
        int s = maxi;
        int e = sum;
        int ans = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int students = countstudents(A, mid);
            if(students<=M)
            {
                ans = mid;
                e = mid - 1;
            }
            else s = mid + 1;
        }
        return ans;
    }
}
