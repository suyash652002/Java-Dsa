public class Question9_Even_odd_type2 {
    public static void main(String[] args) {
//        17->15->8->9->2->4->6
        int[] arr = {17, 15, 8, 9, 2, 4, 6};
        Node head = convert(arr);
        print(head);
        System.out.println();
        Node divide = divide(head);
        print(divide);
    }
    static Node divide(Node head) {
        // code here
        Node evenHead = new Node(0);
        Node even = evenHead;
        Node oddHead = new Node(0);
        Node odd = oddHead;

        if(head == null) return null;
        Node temp = head;
        while(temp!=null)
        {

            if(temp.data %2 != 0)
            {
                odd.next = temp;
                odd = temp;
            }
            else
            {
                even.next = temp;
                even = temp;
            }
            temp = temp.next;
        }
        even.next = oddHead.next;
        odd.next = null;
        Node newHead = evenHead.next;
        return newHead;
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
