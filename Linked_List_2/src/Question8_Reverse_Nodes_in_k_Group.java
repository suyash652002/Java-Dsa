public class Question8_Reverse_Nodes_in_k_Group {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 6, 7, 8, 9, 10};
        Node head = convert(arr);
//        print(head);
        Node reversek = reverseKGroup(head, 3);
        print(reversek);

    }
    public static Node reverseKGroup(Node head, int k) {
        Node temp = head;
        Node prevNode = null;
        while(temp != null)
        {
            Node kthNode = KthNode(head, k);
            if(kthNode == null)
            {
                if(prevNode != null)
                {
                    prevNode.next = temp;
                }
            }
            Node nextNode = kthNode.next;
            kthNode.next = null;
            reverse(head);
            if(head == temp)
            {
                head = kthNode;
            }
            else
            {
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
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
    public static Node KthNode(Node head, int k)
    {
        Node temp = head;
        for(int i = 1; i<k; i++)
        {
            temp = temp.next;
        }
        return temp;
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
