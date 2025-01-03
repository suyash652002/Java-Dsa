import java.util.Arrays;
import java.util.ArrayList;

public class Rat_in_a_Maze {
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
        int[][] visited = new int[arr.length][arr.length];

//        solve(arrayList, visited, 0, 0, "", arr.length);
        System.out.println(findPath(arrayList));
    }

    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        // code here
        int[][] visited = new int[mat.size()][mat.size()];
        ArrayList<String> ans = new ArrayList<>();
        solve(mat, visited, 0, 0, "", mat.size() ,ans);
        return ans;
    }
    public static void solve(ArrayList<ArrayList<Integer>> arr, int[][] visited, int row, int col, String s, int n, ArrayList<String> ans)
    {
        if(row==n-1 && col==n-1)
        {
            ans.add(s);
            return;
        }
        else {
            visited[row][col] = 1;
        }
        if(row+1 < n && visited[row+1][col] == 0 && arr.get(row+1).get(col) == 1)
        {
            solve(arr, visited, row+1, col, s+'D', n, ans);
        }
        if(col-1 >=0 && visited[row][col-1] == 0 && arr.get(row).get(col-1) == 1)
        {
            solve(arr, visited, row, col-1, s+'L', n, ans);
        }
        if(col+1<n && visited[row][col+1] == 0 && arr.get(row).get(col+1) == 1)
        {
            solve(arr, visited, row, col+1, s+'R', n, ans);
        }
        if(row-1>=0 && visited[row-1][col] == 0 && arr.get(row-1).get(col) == 1)
        {
            solve(arr, visited, row-1, col, s+'U', n, ans);
        }
        visited[row][col] = 0;
    }
//    public static void solve(int[][] arr, int[][] visited, int row, int col, String s, int n)
//    {
//        if(row==n-1 && col==n-1)
//        {
//            System.out.println(s);
//            return;
//        }
//        else {
//            visited[row][col] = 1;
////            print(visited);
//        }
//        if(row+1 < n && visited[row+1][col] == 0 && arr[row+1][col] == 1)
//        {
//            solve(arr, visited, row+1, col, s+'D', n);
//        }
//        if(col-1 >=0 && visited[row][col-1] == 0 && arr[row][col-1] == 1)
//        {
//            solve(arr, visited, row, col-1, s+'L', n);
//        }
//        if(col+1<n && visited[row][col+1] == 0 && arr[row][col+1] == 1)
//        {
//            solve(arr, visited, row, col+1, s+'R', n);
//        }
//        if(row-1>=0 && visited[row-1][col] == 0 && arr[row-1][col] == 1)
//        {
//            solve(arr, visited, row-1, col, s+'U', n);
//        }
//        visited[row][col] = 0;
////        print(visited);
//    }
    public static void print(int[][] arr)
    {
        System.out.println("Visited array");
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
