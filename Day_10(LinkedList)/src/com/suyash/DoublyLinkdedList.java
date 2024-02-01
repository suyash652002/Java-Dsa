package com.suyash;
class Node{
    int data;
    Node next;
    Node prev;

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

public class DoublyLinkdedList {

    public static Node convertarr2DLL(int[] arr)
    {
        Node head = new Node(arr[0], null, null);
        Node back = head;
        for(int i = 1; i<arr.length; i++)
        {
            Node temp = new Node(arr[i], null, back);
            back.next = temp;
            back = temp;
        }
        return head;
    }
    public static void print(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public static Node deleteHead(Node head)
    {
        if(head == null) return null;
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }
    public static Node deleteTail(Node head)
    {
        if(head == null) return null;
        if(head.next == null)
        {
            head = null;
            return null;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node back = temp.prev;
        back.next = null;
        temp.prev = null;
        return head;
    }
    public static Node deleteKthnode(Node head, int k)
    {
        if(head == null) return null;
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            if(count == k)
                break;
            temp = temp.next;
        }
        Node front = temp.next;
        Node back = temp.prev;
        if(front == null && back == null) return null;
        if(front == null) deleteTail(head);
        if(back == null) deleteHead(head);

        back.next = front;
        front.prev = back;
        temp.next = null;
        temp.prev = null;
        return head;
    }
    public static void deletegivenNode(Node node)
    {
        Node front = node.next;
        Node back = node.prev;
        if(front == null)
        {
            return;
        }
        back.next = front;
        front.prev = back;
        node.next = node.prev = null;
    }

    public static Node insertBeforeHead(Node head, int val)
    {
        Node temp = new Node(val, head, null);
        head.prev = temp;
        head = temp;
        return head;
    }
    public static Node insertbeforeTail(Node head, int val)
    {
        Node tail = head;
        while(tail.next != null)
        {
            tail = tail.next;
        }
        Node back = tail.prev;
        Node newNode = new Node(val, tail, back);
        back.next = newNode;
        tail.prev = newNode;
        return head;
    }
    public static Node insertbeforeKthele(Node head, int k, int val)
    {
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            if(count == k) break;
            temp = temp.next;
        }
        Node back = temp.prev;
        Node newNode = new Node(val, temp, back);
        temp.prev = newNode;
        back.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Node head = convertarr2DLL(arr);
        print(head);
        System.out.println("Inserting before head node");
        Node newnode = insertbeforeKthele(head, 3, 10);
//        deletegivenNode(head.next.next);
        print(newnode);

    }

}
