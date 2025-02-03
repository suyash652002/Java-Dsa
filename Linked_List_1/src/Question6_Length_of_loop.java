public class Question6_Length_of_loop {
    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node head = new Node(1, node2);

        node5.next = node2;
//        print(head);
        System.out.println("Length of Loop is : " + lengthOfLoop(head));
    }
    public static int lengthOfLoop(Node head)
    {
        Node fast = head;
        Node slow = head;
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
    public static int search(Node slow, Node fast)
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
