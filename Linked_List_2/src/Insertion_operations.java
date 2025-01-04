public class Insertion_operations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Node head = convert(arr);
        Node insert = insertBeforeNode(head, 0, 6);
        print(insert);
    }
    // Insert before the node
    public static Node insertBeforeNode(Node head, int val, int x)
    {
        if(head == null) return null;
        if(head.data == x)
        {
            Node newNode = new Node(val, head, null);
            head.prev = newNode;
            return newNode;
        }
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == x)
            {
                Node prev = temp.prev;
                Node newNode = new Node(val, temp, prev);
                prev.next = newNode;
                temp.prev = newNode;
            }
            temp = temp.next;
        }
        return head;
    }
    //Insert before Kth element
    public static Node insertBeforeKthEle(Node head, int val, int k)
    {
        if(head == null) return null;
        if(k == 1)
        {
            Node newNode = new Node(val, head, null);
            head.prev = newNode;
            return newNode;
        }
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            ++count;
            if(count == k)
            {
                Node prev = temp.prev;
                Node newNode = new Node(val, temp, prev);
                prev.next = newNode;
                temp.prev = newNode;
            }
            temp = temp.next;
        }
        return head;
    }
    // Insertion before the tail
    public static Node insertBeforeTail(Node head, int val)
    {
        if(head == null) return null;
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        Node prev = temp.prev;
        Node newNode = new Node(val, temp, prev);
        temp.prev = newNode;
        prev.next = newNode;
        return head;
    }
    public static Node insertAtHead(Node head, int val)
    {
        if(head == null)
        {
            return new Node(val, null, null);
        }
        Node newHead = new Node(val, head, null);
        head.prev = newHead;
        return newHead;
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
