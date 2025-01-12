public class Question18_Rotate_List {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        ListNode head = convert(arr);
//        System.out.println(rotateRight(head, 2));
        ListNode ans = rotateRight(head, 2);
        print(ans);
    }

    public static ListNode findTail(ListNode temp, int k)
    {
        for(int i = 1; i<k; i++)
        {
            temp = temp.next;
        }
        return temp;
    }
    public static ListNode rotateRight(ListNode head, int k)
    {
        ListNode tail = head;
        int length = 1;
        while(tail.next != null)
        {
            tail = tail.next;
            length++;
        }
        if(k%length == 0) return head;
        k = k% length;
        ListNode temp = head;
        ListNode actualTail = findTail(temp, length - k);
        tail.next = head;
        head = actualTail.next;
        actualTail.next = null;
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
