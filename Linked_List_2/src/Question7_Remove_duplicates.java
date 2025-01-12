public class Question7_Remove_duplicates {
    public static void main(String[] args) {
//        n = 6
//        1<->1<->1<->2<->3<->4
        int[] arr = {1, 1, 1, 2, 3, 4};
        int n = 6;
        Node head = convert(arr);
//        print(head);
        Node ans = remove(head);
        print(ans);
    }
    public static Node remove(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node curr = head.next;
        Node prev = head;
        while(curr !=null)
        {
            if(curr.data == prev.data)
            {
                Node next = curr.next;
                prev.next = next;
                if(next!=null)
                {
                    next.prev = prev;
                }
            }
            else prev = curr;
            curr = curr.next;
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
