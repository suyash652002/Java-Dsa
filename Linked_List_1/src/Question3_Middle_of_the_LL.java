public class Question3_Middle_of_the_LL {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        ListNode head = convert(arr);
        print(head);
        System.out.println();
        ListNode middle = middle(head);
        print(middle);
    }
    // Optimised solution
    public static ListNode middle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // Naive solution
//    public static Node middle(Node head)
//    {
//        int count = 0;
//        Node temp = head;
//        while(temp!=null)
//        {
//            count++;
//            temp = temp.next;
//        }
//        int middleNode = count/2;
//        temp = head;
//        while(temp!=null)
//        {
//            if(middleNode == 0)
//            {
//                return temp;
//            }
//            middleNode--;
//            temp = temp.next;
//        }
//        return head;
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
