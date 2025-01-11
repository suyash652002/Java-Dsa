public class Question16_Sort_List {
    public static void main(String[] args) {
        int[] arr = {-1,5,3,4,0};
        Node head = convert(arr);
        sort(head);
        print(head);
    }
    public static Node findMiddle(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static Node sort(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node middle = findMiddle(head);
        Node right = middle.next;
        middle.next = null;
        Node left = head;
        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }
    public static Node merge(Node list1, Node list2)
    {
        Node dummy = new Node(0);
        Node temp = dummy;
        while(list1!= null && list2!=null)
        {
            if(list1.data <= list2.data)
            {
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }
            else
            {
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }
        if(list1!=null)
        {
            temp.next = list1;
        }else
        {
            temp.next = list2;
        }
        return dummy.next;
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
