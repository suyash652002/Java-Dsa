public class Question5_Starting_point_of_loop_in_LL {
    public static void main(String[] args) {
        Node head = new Node(1, null);
        Node node10 = new Node(9, null);
        Node node9 = new Node(8, node10);
        Node node8 = new Node(7, node9);
        Node node7 = new Node(6, node8);
        Node node6 = new Node(13, node7);
        Node node5 = new Node(4, node6);
        Node node4 = new Node(15, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        head.next = node2;
        node10.next = node4;

//        print(head);
        Node ans = detectCycle(head);
        print(ans);
    }
    public static Node detectCycle(Node head)
    {
        Node slow = head;
        Node fast = head;
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
