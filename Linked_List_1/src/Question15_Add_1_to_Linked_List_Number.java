public class Question15_Add_1_to_Linked_List_Number {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6};
        Node head = convert(arr);
//        print(head);
        Node reverse = reverseList(head);
        print(reverse);
        System.out.println();
        Node ans = addOne(reverse);
        print(ans);

    }
    public static Node addOne(Node head) {
        // code here.
        if(head == null) return null;
        int carry = 1;
        Node temp = head;
        while(temp != null)
        {
            temp.data += carry;
            if(temp.data >= 10)
            {
                carry = 1;
                temp.data = temp.data % 10;
            }
            else
            {
                carry = 0;
            }
            if(temp.next == null && carry == 1)
            {
                Node newNode = new Node(1);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
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
