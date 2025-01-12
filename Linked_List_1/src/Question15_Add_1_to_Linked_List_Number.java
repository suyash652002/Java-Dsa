public class Question15_Add_1_to_Linked_List_Number {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6};
        ListNode head = convert(arr);
//        print(head);
        ListNode reverse = reverseList(head);
        print(reverse);
        System.out.println();
        ListNode ans = addOne(reverse);
        print(ans);

    }
    public static ListNode addOne(ListNode head) {
        // code here.
        if(head == null) return null;
        int carry = 1;
        ListNode temp = head;
        while(temp != null)
        {
            temp.data += carry;
            if(temp.data >= 10)
            {
                carry = 1;
                temp.data = temp.data % 10;
            }
            else
            {
                carry = 0;
            }
            if(temp.next == null && carry == 1)
            {
                ListNode newNode = new ListNode(1);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
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
