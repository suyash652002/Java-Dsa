public class Question16_Sort_List {
    public static void main(String[] args) {
        int[] arr = {-1,5,3,4,0};
        ListNode head = convert(arr);
        sort(head);
        print(head);
    }
    public static ListNode findMiddle(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static ListNode sort(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;
        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }
    public static ListNode merge(ListNode list1, ListNode list2)
    {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
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
    public static ListNode convert(int[] arr)
    {
        if(arr.length == 0) return null;
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
}
