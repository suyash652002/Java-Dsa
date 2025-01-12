public class Question5_Starting_point_of_loop_in_LL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        ListNode node10 = new ListNode(9, null);
        ListNode node9 = new ListNode(8, node10);
        ListNode node8 = new ListNode(7, node9);
        ListNode node7 = new ListNode(6, node8);
        ListNode node6 = new ListNode(13, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(15, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        head.next = node2;
        node10.next = node4;

//        print(head);
        ListNode ans = detectCycle(head);
        print(ans);
    }
    public static ListNode detectCycle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
            {
                slow = head;
                while(fast!=slow)
                {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
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
