public class Question17_Reverse_Node_in_k_group {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 6, 7, 8, 9, 10};
        ListNode head = convert(arr);
        print(head);
        ListNode reversek = reverseKGroup(head, 3);
        print(reversek);

    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;
        while(temp != null)
        {
            ListNode kthNode = KthNode(temp, k);
            if(kthNode == null)
            {
                if(prevLast != null)
                {
                    prevLast.next = temp;
                }
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if(temp == head)
            {
                head = kthNode;
            }
            else
            {
                prevLast.next = kthNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }
    public static ListNode reverse(ListNode head) {
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
    public static ListNode KthNode(ListNode temp, int k)
    {
        k -= 1;

        // Decrement K until it reaches
        // the desired position
        while (temp != null && k > 0) {
            // Decrement k as temp progresses
            k--;

            // Move to the next node
            temp = temp.next;
        }

        // Return the Kth node
        return temp;
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
