public class Array_to_LL {
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
    public static void traverseLL(Node head)
    {
        System.out.println("Linked list");
        while(head!=null)
        {
            System.out.print(head.data+" -> ");
            head = head.next;
        }
        System.out.print("null");
    }
    public static int length_of_ll(Node head)
    {
        int count = 0;
        while(head!=null)
        {
            count++;
            head = head.next;
        }
        return count;
    }
    public static boolean Search(Node head, int key)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convert(arr);
        traverseLL(head);
        System.out.println();
        System.out.println("Length of LL : " + length_of_ll(head));
        System.out.println(Search(head, 5));
    }

}
