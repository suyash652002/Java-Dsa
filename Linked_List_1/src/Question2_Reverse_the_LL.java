public class Question2_Reverse_the_LL {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convert(arr);
        print(head);
        System.out.println();
        Node reverse = reverseList(head);
        print(reverse);
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
