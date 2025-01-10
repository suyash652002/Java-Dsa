public class Question8_Add_two_numbers {
    public static void main(String[] args) {
//        int[] arr1 = {2, 4, 3};
//        int[] arr2 = {5, 6, 4};
        int[] arr1 = {4, 5};
        int[] arr2 = {3, 4, 5};
        Node l1 = convert(arr1);
        Node l2 = convert(arr2);
//        System.out.println("Answer");
        Node ansNode = addTwoLists(l1, l2);
        print(ansNode);

    }

    public static Node addTwoLists(Node num1, Node num2){
        Node l1 = reverse(num1);
        Node l2 = reverse(num2);
        int carry = 0;
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(l1 != null || l2 != null || carry == 1)
        {
            int sum = 0;
//            if(l1.data == 0 && l2 == null && carry == 0) break;
//            if(l1 == null && l2.data == 0 && carry == 0) break;
            if(l1!=null)
            {
                sum+=l1.data;
                l1 = l1.next;
            }
            if(l2!=null)
            {
                sum+=l2.data;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;

            Node node = new Node(sum%10);
            temp.next = node;
            temp = node;
        }
        Node ans = reverse(dummy.next);
        return ans;
    }
    public static Node reverse(Node head)
    {
        Node curr = head;
        Node prevNode = null;
        while(curr != null)
        {
            Node nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }
        return prevNode;
    }

//    public static Node addTwoNumbers(Node l1, Node l2)
//    {
//        int carry = 0;
//        Node dummy = new Node(-1);
//        Node temp = dummy;
//        while(l1 != null || l2 != null || carry == 1)
//        {
//            int sum = 0;
//            if(l1!=null)
//            {
//                sum+=l1.data;
//                l1 = l1.next;
//            }
//            if(l2!=null)
//            {
//                sum+=l2.data;
//                l2 = l2.next;
//            }
//            sum += carry;
//            carry = sum/10;
//
//            Node node = new Node(sum%10);
//            temp.next = node;
//            temp = node;
//        }
//        return dummy.next;
//
//    }

    public static Node convert(int[] arr)
    {
        if(arr.length == 0) return null;
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
