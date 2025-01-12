public class Question4_Detect_loop {
    public static void main(String[] args) {
        ListNode head = new ListNode(3, null);
        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(0, node4);
        ListNode node2 = new ListNode(2, node3);
        head.next = node2;
        node4.next = node2;
//        print(head);
        System.out.println(detectCycle(head));
    }
    public static boolean detectCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
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
