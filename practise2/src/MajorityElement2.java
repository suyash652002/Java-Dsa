import java.util.ArrayList;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(majority(arr));
    }
    public static ArrayList<Integer> majority(int[] arr)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for(int i : arr)
        {
            if(cnt1 == 0 && i != ele2)
            {
                ele1 = i;
                cnt1 = 1;
            }
            else if(cnt2 == 0 && i != ele1)
            {
                ele2 = i;
                cnt2 = 1;
            }
            else if(ele1 == i) cnt1++;
            else if(ele2 == i) cnt2++;
            else
            {
                cnt2--;
                cnt1--;
            }
        }
        cnt2 = 0;
        cnt1 = 0;
        for(int i : arr)
        {
            if(ele1 == i) cnt1++;
            if(ele2 == i) cnt2++;
        }
        int n = arr.length;
        if(cnt1 > n/3) ans.add(ele1);
        if(cnt2 > n/3) ans.add(ele2);
        return ans;
    }

}
