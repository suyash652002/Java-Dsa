public class Insert_Operations {


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        Node head = convert(arr);
        Node insert = insert_before_x(head, 2, 30);
        print(insert);
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
    public static Node insert_before_x(Node head, int x, int val)
    {
        if(head == null)
        {
            return new Node(x);
        }
        if(head.data == x)
        {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        Node prev = head;
        while(temp!=null)
        {
            if(temp.data == x)
            {
                Node newNode = new Node(val);
                newNode.next = temp;
                prev.next = newNode;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static Node insert_at_kth_position(Node head, int val, int k)
    {
        if(head == null)
        {
            if(k == 1)
            {
                return new Node(val);
            }
        }
        if(k == 1)
        {
            Node newHead = new Node(val);
            newHead.next = head;
            return newHead;
        }
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            ++count;
            if(count == k-1)
            {
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node insert_at_last(Node head, int val)
    {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
    public static Node insert_at_first(Node head, int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
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

}
