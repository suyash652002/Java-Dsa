import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question10_Rat_in_a_maze {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        // Row 1
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(0);
        row1.add(0);
        row1.add(0);
        arrayList.add(row1);

        // Row 2
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        row2.add(0);
        row2.add(1);
        arrayList.add(row2);

        // Row 3
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(1);
        row3.add(1);
        row3.add(0);
        row3.add(0);
        arrayList.add(row3);

        // Row 4
        ArrayList<Integer> row4 = new ArrayList<>();
        row4.add(0);
        row4.add(1);
        row4.add(1);
        row4.add(1);
        arrayList.add(row4);
//        for(int i = 0; i<arrayList.size(); i++)
//        {
//            System.out.println(arrayList.get(i));
//        }
        System.out.println(ratInMaze(arrayList));
    }
    public static List<String> ratInMaze(ArrayList<ArrayList<Integer>> mat)
    {
        ArrayList<String> ans = new ArrayList<>();
        solve(0, 0, mat, "", ans);
        return ans;
    }
    public static void solve(int row, int col, ArrayList<ArrayList<Integer>> arr, String path, ArrayList<String> ans)
    {
        int n = arr.size();
        if(row<0 || col<0 || row>=n || col>=n || arr.get(row).get(col) == 0 || arr.get(row).get(col) == -1)
        {
            return;
        }
        if(row == n-1 && col == n-1)
        {
            ans.add(path);
            return;
        }
//        arr[row][col] = -1;
        arr.get(row).set(col, -1);
        solve(row+1, col, arr, path+'D', ans);
        solve(row-1, col, arr, path+'U', ans);
        solve(row, col-1, arr, path+'L', ans);
        solve(row, col+1, arr, path+'R', ans);

        arr.get(row).set(col, 1);
    }
//    public static List<String> ratInMaze(int[][] arr)
//    {
//        List<String> ans = new ArrayList<>();
//        solve(0, 0, arr, "", ans);
//        return ans;
//    }
//    public static void solve(int row, int col, int[][] arr, String path, List<String> ans)
//    {
//        int n = arr.length;
//        if(row<0 || col<0 || row>=n || col>=n || arr[row][col] == 0 || arr[row][col] == -1)
//        {
//            return;
//        }
//        if(row == n-1 && col == n-1)
//        {
//            ans.add(path);
//            return;
//        }
//        arr[row][col] = -1;
//        solve(row+1, col, arr, path+'D', ans);
//        solve(row-1, col, arr, path+'U', ans);
//        solve(row, col-1, arr, path+'L', ans);
//        solve(row, col+1, arr, path+'R', ans);
//
//        arr[row][col] = 1;
//    }
}
