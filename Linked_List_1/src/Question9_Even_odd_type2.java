public class Question9_Even_odd_type2 {
    public static void main(String[] args) {
//        17->15->8->9->2->4->6
        int[] arr = {17, 15, 8, 9, 2, 4, 6};
        ListNode head = convert(arr);
        print(head);
        System.out.println();
        ListNode divide = divide(head);
        print(divide);
    }
    static ListNode divide(ListNode head) {
        // code here
        ListNode evenHead = new ListNode(0);
        ListNode even = evenHead;
        ListNode oddHead = new ListNode(0);
        ListNode odd = oddHead;

        if(head == null) return null;
        ListNode temp = head;
        while(temp!=null)
        {

            if(temp.data %2 != 0)
            {
                odd.next = temp;
                odd = temp;
            }
            else
            {
                even.next = temp;
                even = temp;
            }
            temp = temp.next;
        }
        even.next = oddHead.next;
        odd.next = null;
        ListNode newHead = evenHead.next;
        return newHead;
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
