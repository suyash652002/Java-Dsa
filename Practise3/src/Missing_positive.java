public class Missing_positive {
    public static void main(String[] args) {
        int[] arr = {0, 1};
        System.out.println(find(arr));
    }
    public static int find(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            int correct = arr[i] - 1;
                if((arr[i]>0 && arr[i]<=n)&&arr[i] != arr[correct]  )
                {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }

            else i++;
        }
        for(int j = 0; j<n; j++)
        {
            if(j+1 != arr[j])
            {
                return j+1;
            }
        }
        return -1;
    }
}
