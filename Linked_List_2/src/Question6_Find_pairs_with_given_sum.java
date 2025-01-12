import java.util.ArrayList;
import java.util.Arrays;

public class Question6_Find_pairs_with_given_sum {
    public static void main(String[] args) {
//        1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
//        target = 7
        int[] arr = {1, 5, 6};
        int target = 6;
        Node head = convert(arr);
//        print(head);
        System.out.println(findPairsWithGivenSum(target, head));

    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        if(head == null || head.next == null)
        {
            return null;
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Node right = findTail(head);
        Node left = head;
        while(left.data < right.data)
        {
            int sum = left.data + right.data;
            if(sum == target)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(left.data);
                temp.add(right.data);
                ans.add(temp);
                left = left.next;
                right = right.prev;
            }
            else if(sum < target)
            {
                left = left.next;
            }
            else
            {
                right = right.prev;
            }
        }
        return ans;
    }
    public static Node findTail(Node head)
    {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        return temp;
    }
    public static void print(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node convert(int[] arr)
    {
        Node head = new Node(arr[0], null, null);
        Node prevNode = head;
        for(int i = 1; i<arr.length; i++)
        {
            Node temp = new Node(arr[i], null, prevNode);
            prevNode.next = temp;
            prevNode = temp;
        }
        return head;
    }
}
