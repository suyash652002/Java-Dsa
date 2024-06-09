
import java.util.*;

public class Threesum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};  // -4, -1, -1, 0, 1, 2,
        System.out.println(sum(arr, 0));
    }
    public static List<List<Integer>> sum(int[] arr, int key)
    {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++)
        {
            if(i!=0 && arr[i] == arr[i-1]) continue;
            int low = i+1;
            int high = arr.length-1;
            while(low < high)
            {
                int sum = arr[i] + arr[low] + arr[high];
                if(sum > key) high--;
                else if(sum < key) low++;
                else{
                    List<Integer> temp = Arrays.asList(arr[i], arr[low], arr[high]);
                    Collections.sort(temp);
                    ans.add(temp);
                    low++;
                    high--;
                    while(low<high && arr[low]== arr[low-1]) low++;
                    while(low<high && arr[high] == arr[high+1]) high--;

                }
            }
        }
        return ans;
    }
//    public static List<List<Integer>> sum(int[] arr, int key)
//    {
//          List<List<Integer>> ans = new ArrayList<List<Integer>>();
//          for(int i = 0; i<arr.length; i++)
//          {
//              Set<Integer> st = new HashSet<>();
//              for(int j = i+1; j<arr.length; j++)
//              {
//                  int third = -(arr[i] + arr[j]);
//                  if(st.contains(third))
//                  {
//                      List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
//                      Collections.sort(temp);
//                      ans.add(temp);
//                  }
//                  st.add(arr[j]);
//              }
//          }
//          return ans;
//    }
//    public static List<List<Integer>> sum(int[] arr, int key)
//    {
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        for(int i = 0; i<arr.length; i++)
//        {
//            if(i!=0 && arr[i] == arr[i-1]) continue;
//            for(int j = i; j<arr.length; j++)
//            {
//                for(int k = j; k<arr.length; k++)
//                {
//                    int sum = arr[i] + arr[j] + arr[k];
//                    if(sum == key)
//                    {
//                        List<Integer> temp = (Arrays.asList(arr[i], arr[j], arr[k]));
//                        ans.add(temp);
//                    }
//                }
//            }
//        }
//        return ans;
//    }
}
