public class Question3_Delete_in_Doubly_LinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9};
        Node head = convert(arr);
        Node ans = deleteNode(head, 1);
        print(ans);
    }
    public static Node deleteNode(Node head, int x) {
        // code here
        if(head == null) return null;
        Node temp = head;
        if(x==1)
        {
            Node nextNode = temp.next;
            if(nextNode != null)
            {
                nextNode.prev = null;
            }
            return nextNode;
        }
        for(int i = 1; i<x; i++)
        {
            temp = temp.next;
        }
        Node nextNode = temp.next;
        Node prevNode = temp.prev;
        if(prevNode != null)
        {
            prevNode.next = nextNode;
        }
        if(nextNode!=null)
        {
            nextNode.prev = prevNode;
        }
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
