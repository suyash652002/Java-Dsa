public class Question6_Length_of_loop {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        node5.next = node2;
//        print(head);
        System.out.println("Length of Loop is : " + lengthOfLoop(head));
    }
    public static int lengthOfLoop(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
            {
                return search(slow, fast);
            }
        }
        return -1;
    }
    public static int search(ListNode slow, ListNode fast)
    {
        int count = 0;
        fast = fast.next;
        while(fast!=slow)
        {
            count++;
            fast = fast.next;
        }
        return count;
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
