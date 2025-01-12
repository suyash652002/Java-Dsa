public class Question10_Sort012 {
    public static void main(String[] args) {
//        1->2->2->1->2->0->2->2
        int[] arr = {2, 0};
        ListNode head = convert(arr);
        print(head);
        System.out.println();
        ListNode ans = segregate(head);
        print(ans);
    }
    public static ListNode segregate(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode zeroD = new ListNode(0);
        ListNode oneD = new ListNode(0);
        ListNode twoD = new ListNode(0);

        ListNode zero = zeroD, one = oneD, two = twoD;

        ListNode curr = head;
        while (curr != null) {
            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            }
            else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
            }
            else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }


        zero.next = (oneD.next != null) ? (oneD.next) : (twoD.next);
        one.next = twoD.next;
        two.next = null;

        head = zeroD.next;
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
