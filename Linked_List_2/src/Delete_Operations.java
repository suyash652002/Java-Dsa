public class Delete_Operations {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Node head = convert(arr);
        Node delete = removeGivenNode(head, 6);
        print(delete);
    }
    public static Node removeGivenNode(Node head, int val)
    {
        if(head==null) return null;
        if(head.data == val)
        {
            Node newHead = head.next;
            newHead.prev = null;
            return newHead;
        }
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == val)
            {
                Node prev = temp.prev;
                if(temp.next == null)
                {
                    Node newNode = deleteTail(head);
                    return newNode;
                }
                Node next = temp.next;
                prev.next = next;
                next.prev = prev;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node deleteKthEle(Node head, int k)
    {
        if(head == null) return null;
        if(k == 1)
        {
            Node newNode = deleteHead(head);
            return newNode;
        }
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            ++count;
            if(count == k)
            {
                Node prevNode = temp.prev;
                Node nextNode = temp.next;
                prevNode.next = temp.next;
                nextNode = temp.prev;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node deleteTail(Node head)
    {
        if(head == null) return null;
        if(head.next == null) return null;
        Node temp = head;
        while(temp.next != null && temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static Node deleteHead(Node head)
    {
        if(head == null)
        {
            return null;
        }
        Node newHead = head.next;
        newHead.prev = null;
        return newHead;
    }
    public static void print(Node head)
    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        Node temp = head;
        System.out.print("<- ");
        while(temp.next!=null)
        {
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println(" -> null");
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
