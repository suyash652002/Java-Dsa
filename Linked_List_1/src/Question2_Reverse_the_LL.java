public class Question2_Reverse_the_LL {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = convert(arr);
        print(head);
        System.out.println();
        ListNode reverse = reverseList(head);
        print(reverse);
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
