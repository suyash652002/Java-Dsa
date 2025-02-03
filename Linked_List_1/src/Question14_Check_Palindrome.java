public class Question14_Check_Palindrome {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1};
        Node head = convert(arr);
//        print(head);
//        Node ans = reverseList(head);
        System.out.println(check(head));
    }
    public static boolean check(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverseList(slow);
        Node first = head;
        Node second = newHead;
        while(second!=null)
        {
            if(first.data!=second.data)
            {
                reverseList(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseList(newHead);
        return true;
    }
    public static Node reverseList(Node head) {
        Node curr = head;
        Node prevNode = null;
        while(curr!=null)
        {
            Node nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }
        return prevNode;
    }
    public static Node convert(int[] arr)
    {
        if(arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
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
