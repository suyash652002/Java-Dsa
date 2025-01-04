public class Node {
    int data;
    Node prev;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Node(int data, Node next, Node prev)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
