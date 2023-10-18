package com.suyash;
import java.util.*;

public class Threesum {

//    *** Brute force solution ***
//    public static List<List<Integer>> threesum(int[] arr)
//    {
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        int n = arr.length;
//        for(int i = 0; i<n; i++)
//        {
//
////            Set<Integer> set = new HashSet<Integer>();
//            for(int j = i+1; j<n; j++)
//            {
//                for(int k = j+1; k<n; k++)
//                {
//                    if(arr[i] + arr[j] + arr[k] == 0)
//                    {
//                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
//                        Collections.sort(temp);
//                        ans.add(temp);
//                    }
//                }
//            }
//        }
//        return ans;
//    }

//    *** Better Solution ***

//    public static List<List<Integer>> threesum(int[] arr)
//    {
//        int n = arr.length;
//        List<List<Integer>> setlist = new ArrayList<List<Integer>>();
//        for(int i = 0; i<n; i++)
//        {
//            Set<Integer> set = new HashSet<Integer>();
//            for(int j = i+1;j<n; j++)
//            {
//                int third = -(arr[i] + arr[j]);
//                if(set.contains(third))
//                {
//                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
//                    setlist.add(temp);
//                }
//                set.add(arr[j]);
//            }
//        }
//        return setlist;
//    }

//    *** Optimized Solution ***
    public static List<List<Integer>> threesum(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 0; i<arr.length; i++)
        {
            if(i>0 && arr[i] == arr[i-1]) continue;
            int low = i+1;
            int high = arr.length-1;
            while(low < high)
            {
                int sum = arr[i] + arr[low] + arr[high];
                if(sum > 0)
                {
                    high--;
                }
                else if(sum < 0)
                {
                    low++;
                }
                else
                {
                    List<Integer> temp = Arrays.asList(arr[i], arr[low], arr[high]);
                    ans.add(temp);
                    high--;
                    low++;
                    while(low<high && arr[low] == arr[low-1]) low++;
                    while(low<high && arr[high] == arr[high+1]) high--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threesum(arr));
    }
}
