public class Question12_Kth_from_End_of_Linked_List {
    public static void main(String[] args) {
//        1->2->3->4->5->6->7->8->9, k = 2
        int[] arr = {1, 2, 3, 4, 5};
        int k = 1;
        Node head = convert(arr);
//        print(head);
        int ans = getKthFromLast(head, k);
        System.out.println(ans);
    }

    static int getKthFromLast(Node head, int k) {
        // Your code here
        if(head == null) return -1;
        Node slow = head;
        Node fast = head;
        for(int i = 0; i<k; i++)
        {
            if(fast == null) return -1;
            fast = fast.next;
        }
        if(fast == null) return head.data;
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.next.data;
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
