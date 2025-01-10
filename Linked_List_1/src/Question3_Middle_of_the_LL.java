public class Question3_Middle_of_the_LL {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        Node head = convert(arr);
        print(head);
        System.out.println();
        Node middle = middle(head);
        print(middle);
    }
    // Optimised solution
    public static Node middle(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // Naive solution
//    public static Node middle(Node head)
//    {
//        int count = 0;
//        Node temp = head;
//        while(temp!=null)
//        {
//            count++;
//            temp = temp.next;
//        }
//        int middleNode = count/2;
//        temp = head;
//        while(temp!=null)
//        {
//            if(middleNode == 0)
//            {
//                return temp;
//            }
//            middleNode--;
//            temp = temp.next;
//        }
//        return head;
//    }
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
