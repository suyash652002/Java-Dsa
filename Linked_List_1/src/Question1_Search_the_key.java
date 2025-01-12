public class Question1_Search_the_key {
    public static void main(String[] args) {
        int[] arr = {41, 5, 0, 95, 26};
        ListNode head = convert(arr);
        print(head);
        System.out.println();
        System.out.println("The key is at position : " + search(head, 26));
    }

    // Recursive approach
    public static int search(ListNode head, int key)
    {
        ListNode temp = head;
        int ans = searchPosition(key, head, 1);
        return ans;
    }
    public static int searchPosition(int key, ListNode temp, int index)
    {
        if(temp == null)
        {
            return -1;
        }
        if(temp.data == key)
        {
            return index;
        }

        return searchPosition(key, temp.next, index+1);
    }
    //Iterative approach
//    public static int search(Node head, int key)
//    {
//        Node temp = head;
//        int count = 0;
//        while(temp!=null)
//        {
//            ++count;
//            if(temp.data == key)
//            {
//                return count;
//            }
//            temp = temp.next;
//        }
//        return -1;
//    }
    public static ListNode convert(int[] arr)
    {
        if(arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for(int i = 1; i<arr.length; i++)
        {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void print(ListNode head)
    {
        System.out.println("Linked list");
        while(head!=null)
        {
            System.out.print(head.data+" -> ");
            head = head.next;
        }
        System.out.print("null");
    }
}
