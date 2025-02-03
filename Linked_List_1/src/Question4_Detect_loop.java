public class Question4_Detect_loop {
    public static void main(String[] args) {
        Node head = new Node(3, null);
        Node node4 = new Node(4, null);
        Node node3 = new Node(0, node4);
        Node node2 = new Node(2, node3);
        head.next = node2;
        node4.next = node2;
//        print(head);
        System.out.println(detectCycle(head));
    }
    public static boolean detectCycle(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
    public static void print(Node head)
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
