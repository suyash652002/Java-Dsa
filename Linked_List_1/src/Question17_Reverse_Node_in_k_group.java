public class Question17_Reverse_Node_in_k_group {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 6, 7, 8, 9, 10};
        Node head = convert(arr);
        print(head);
        Node reversek = reverseKGroup(head, 3);
        print(reversek);
    }
    public static Node reverseKGroup(Node head, int k) {
        Node temp = head;
        Node prevLast = null;
        while(temp != null)
        {
            Node kthNode = KthNode(temp, k);
            if(kthNode == null)
            {
                if(prevLast != null)
                {
                    prevLast.next = temp;
                }
                break;
            }
            Node nextNode = kthNode.next;
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
    public static Node reverse(Node head) {
        Node curr = head;
        Node prevNode = null;
        while(curr!=null)
        {
            Node nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }
        return prevNode;
    }
    public static Node KthNode(Node temp, int k)
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
    public static Node convert(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void print(Node head)
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
