public class Question13_Delete_the_Middle_Node {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,1,2,6};
        ListNode head = convert(arr);
//        print(head);
        ListNode ans = deleteMiddle(head);
        print(ans);
    }
    public static ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode prev = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        return head;

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
