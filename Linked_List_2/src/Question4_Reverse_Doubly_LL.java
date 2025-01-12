public class Question4_Reverse_Doubly_LL {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convert(arr);
//        print(head);
        Node reverse = reverse(head);
        print(reverse);
    }
    
    public static Node reverse(Node head)
    {
        Node curr = head;
        Node prevNode = null;
        Node nextNode;
        while (curr != null)
        {
            nextNode = curr.next;
            curr.prev = nextNode;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;

        }
        return prevNode;
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
