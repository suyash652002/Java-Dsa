public class Question2_Delete_in_Doubly_Linked_List {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4};
        Node head = convert(arr);
        print(head);
//        Input: LinkedList = 1 <--> 3 <--> 4, x = 3
//        Output: 1 <--> 3
    }
    public Node deleteNode(Node head, int x) {
        // code here
        if(head == null)return null;
        for(int i = 1; i<x; i++)
        {

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
