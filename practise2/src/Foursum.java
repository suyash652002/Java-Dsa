import java.util.*;
public class Foursum {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        System.out.println(sum(arr));
    }

    public static List<List<Integer>> sum(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 0; i<arr.length; i++)
        {
            if(i!=0 && arr[i] == arr[i-1]) continue;
            for(int j = i+1; j<arr.length; j++)
            {
                if(j>i+1 && arr[j] == arr[j-1]) continue;
                int low = j+1;
                int high = arr.length-1;
                while(low < high)
                {
//                    int sum = arr[i] + arr[j] + arr[low] + arr[high];
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[low];
                    sum += arr[high];
                    if(sum < 0) low++;
                    if(sum > 0) high--;
                    else
                    {
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[low],arr[high]);
                        ans.add(temp);
                        low++;
                        high--;
                        while(low<high && arr[low] == arr[low-1]) continue;
                        while (low<high && arr[high] == arr[high+1]) continue;
                    }
                }
            }
        }
        return ans;
    }
//    public static List<List<Integer>> sum(int[] arr)
//    {
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        for(int i = 0; i<arr.length; i++)
//        {
//            for(int j = i+1; j<arr.length; j++)
//            {
//                Set<Integer> st = new HashSet<>();
//                for(int k = j+1; k<arr.length; k++)
//                {
//                    int fourth = -(arr[i] + arr[j] + arr[k]);
//                    if(st.contains(fourth))
//                    {
//                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], fourth);
//                        ans.add(temp);
//                    }
//                    st.add(arr[k]);
//                }
//            }
//        }
//        return ans;
//    }
//    public static List<List<Integer>> sum(int[] arr)
//    {
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        for(int i = 0; i<arr.length; i++)
//        {
//            for(int j = i+1; j<arr.length; j++)
//            {
//                for(int k = j+1; k<arr.length; k++)
//                {
//                    for(int l = k+1; l<arr.length; l++)
//                    {
//                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
//                        if(sum == 0)
//                        {
//                            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
//                            ans.add(temp);
//                        }
//                    }
//                }
//            }
//        }
//        return ans;
//    }
}
