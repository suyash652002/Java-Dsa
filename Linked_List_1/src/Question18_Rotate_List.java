public class Question18_Rotate_List {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        Node head = convert(arr);
//        System.out.println(rotateRight(head, 2));
        Node ans = rotateRight(head, 2);
        print(ans);
    }

    public static Node findTail(Node temp, int k)
    {
        for(int i = 1; i<k; i++)
        {
            temp = temp.next;
        }
        return temp;
    }
    public static Node rotateRight(Node head, int k)
    {
        Node tail = head;
        int length = 1;
        while(tail.next != null)
        {
            tail = tail.next;
            length++;
        }
        if(k%length == 0) return head;
        k = k% length;
        Node temp = head;
        Node actualTail = findTail(temp, length - k);
        tail.next = head;
        head = actualTail.next;
        actualTail.next = null;
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
