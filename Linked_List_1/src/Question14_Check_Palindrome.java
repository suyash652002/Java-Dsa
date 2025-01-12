public class Question14_Check_Palindrome {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1};
        ListNode head = convert(arr);
//        print(head);
//        Node ans = reverseList(head);
        System.out.println(check(head));
    }
    public static boolean check(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverseList(slow);
        ListNode first = head;
        ListNode second = newHead;
        while(second!=null)
        {
            if(first.data!=second.data)
            {
                reverseList(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseList(newHead);
        return true;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prevNode = null;
        while(curr!=null)
        {
            ListNode nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }
        return prevNode;
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
