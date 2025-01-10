public class Question1_Doubly_linkedlist_Insertion_at_given_position {
    public static void main(String[] args) {
//        2<->4<->5, p = 2, x = 6
        int[] arr = {2, 4, 5};
        int p = 2, x = 6;
        Node head = convert(arr);
        Node solve = addNode(head, p, x);
        print(solve);
    }
    static Node addNode(Node head, int p, int x) {
        // Your code here
        if(head == null) return null;
        Node temp = head;
        for(int i =0; i<p; i++)
        {
            temp = temp.next;
        }
        Node nextNode = temp.next;
        Node newNode = new Node(x);
        if(nextNode != null)
        {
            newNode.next = nextNode;
            nextNode.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
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
        if(arr.length == 0) return null;
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
