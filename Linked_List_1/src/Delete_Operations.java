public class Delete_Operations {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Node head = convert(arr);
//        Node deleteFirst = delete_at_start(head);
//        Node deleteLast = delete_at_last(head);
//        Node deleteK = delete_at_kth_position(head, 1);
//        print(head);
        Node deleteK = delete_at_kth_position(head, 6);
        print(deleteK);
    }

    public static Node delete_at_kth_position(Node head, int k)
    {
        if(head == null)
        {
            return null;
        }
        if(k==1)
        {
            return head.next;
        }
        Node temp = head;
        int count = 0;
        while(temp!=null)
        {
            ++count;
            if(count == k-1)
            {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node delete_at_last(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        Node temp = head;
        while(temp.next.next !=null)
        {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static Node delete_at_start(Node head)
    {
        Node newHead = head.next;
        head.next = null;
        return newHead;
    }
    public static Node convert(int[] arr)
    {
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
