public class Question13_Delete_the_Middle_Node {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,1,2,6};
        Node head = convert(arr);
//        print(head);
        Node ans = deleteMiddle(head);
        print(ans);
    }
    public static Node deleteMiddle(Node head) {
        Node slow = head;
        Node prev = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        return head;

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
