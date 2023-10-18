package com.suyash;
import java.util.*;

public class Foursum {

//     *** Brute force solution ****
//    public static List<List<Integer>> sum(int[] arr, int target)
//    {
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        int n = arr.length;
//        for(int i = 0; i<n; i++)
//        {
//            for(int j = i+1; j<n; j++)
//            {
//                for(int k= j+1; k<n; k++)
//                {
//                    for(int l = k+1; l<n; l++)
//                    {
//                        if(arr[i] + arr[j]+ arr[k]+arr[l] == target)
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

//    *** Better solution ***

//    public static List<List<Integer>> sum(int[] arr, int target)
//    {
//        int n = arr.length;
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        for(int i = 0; i<n; i++)
//        {
//            for(int j = i+1; j<n; j++)
//            {
//                Set<Integer> set = new HashSet<Integer>();
//                for(int k = j+1; k<n; k++)
//                {
//                    int fourth = target - (arr[i] + arr[j] + arr[k]);
//                    if(set.contains(fourth))
//                    {
//                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], fourth);
//                        ans.add(temp);
//                    }
//                    set.add(arr[k]);
//                }
//            }
//        }
//        return ans;
//    }

//    *** Optimized Solution ***
    public static List<List<Integer>> sum(int[] arr, int target)
    {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int n = arr.length;
        for(int i = 0; i<n; i++)
        {
            if(i>0 && arr[i]==arr[i-1])continue;
            for(int j = i+1; j<n; j++)
            {
                if(j>0 && arr[j] == arr[j-1]) continue;
                int low = j+1;
                int high = n-1;
                while(low < high)
                {
                    int sum = arr[i] + arr[j] + arr[low] + arr[high];
                    if(sum < target)
                    {
                        low++;
                    }
                    else if(sum > target)
                    {
                        high--;
                    }
                    else{
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[low], arr[high]);
                        ans.add(temp);
                        low++;
                        high--;

                        while(low<high && arr[low] == arr[low-1]) low++;
                        while(low<high && arr[high] == arr[high+1]) high--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(sum(arr, target));
    }
}
