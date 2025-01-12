public class Question5_Delete_all_occ_of_a_key {
    public static void main(String[] args) {
//        2<->2<->10<->8<->4<->2<->5<->2
//        2
        int[] arr = {2, 2, 10, 8, 4, 2, 5, 2};
        int x = 2;
        Node head = convert(arr);
//        print(head);
        Node ans = deleteAllOccurOfX(head, x);
        print(ans);
    }
    public static Node deleteAllOccurOfX(Node head, int x) {
        if(head == null) return null;
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == x)
            {
                if(temp == head)
                {
                    head = head.next;
                }
                Node next = temp.next;
                Node prev = temp.prev;
                if(next!=null)
                {
                    next.prev = prev;
                }
                if(prev != null)
                {
                    prev.next = next;
                }
            }
            temp = temp.next;

        }
        return head;
    }
    public static void print(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node convert(int[] arr)
    {
        Node head = new Node(arr[0], null, null);
        Node prevNode = head;
        for(int i = 1; i<arr.length; i++)
        {
            Node temp = new Node(arr[i], null, prevNode);
            prevNode.next = temp;
            prevNode = temp;
        }
        return head;
    }
}
