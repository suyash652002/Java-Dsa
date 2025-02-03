public class Question11_Remove_Nth_Node_From_End_of_List {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 4;
        Node head = convert(arr);
//        print(head);
        Node ans = removeNthFromEnd(head, n);
        print(ans);
    }
    public static Node removeNthFromEnd(Node head, int n) {
        if(head == null) return null;
        Node slow = head;
        Node fast = head;
        for(int i = 0; i<n; i++)
        {
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
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
