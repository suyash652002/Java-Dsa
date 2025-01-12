public class Insert_Operations {


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        ListNode head = convert(arr);
        ListNode insert = insert_before_x(head, 2, 30);
        print(insert);
    }
    public static void print(ListNode head)
    {
        System.out.println("Linked list");
        while(head!=null)
        {
            System.out.print(head.data+" -> ");
            head = head.next;
        }
        System.out.print("null");
    }
    public static ListNode insert_before_x(ListNode head, int x, int val)
    {
        if(head == null)
        {
            return new ListNode(x);
        }
        if(head.data == x)
        {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            return newNode;
        }
        ListNode temp = head;
        ListNode prev = head;
        while(temp!=null)
        {
            if(temp.data == x)
            {
                ListNode newNode = new ListNode(val);
                newNode.next = temp;
                prev.next = newNode;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static ListNode insert_at_kth_position(ListNode head, int val, int k)
    {
        if(head == null)
        {
            if(k == 1)
            {
                return new ListNode(val);
            }
        }
        if(k == 1)
        {
            ListNode newHead = new ListNode(val);
            newHead.next = head;
            return newHead;
        }
        int count = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            ++count;
            if(count == k-1)
            {
                ListNode newNode = new ListNode(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static ListNode insert_at_last(ListNode head, int val)
    {
        ListNode temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        ListNode newNode = new ListNode(val);
        temp.next = newNode;
        return head;
    }
    public static ListNode insert_at_first(ListNode head, int val)
    {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static ListNode convert(int[] arr)
    {
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for(int i = 1; i<arr.length; i++)
        {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

}
