//package com.suyash;
//class Node{
//    int data;
//    Node next;
//
//    Node(int data, Node next)
//    {
//        this.data = data;
//        this.next = next;
//    }
//    Node(int data)
//    {
//        this.data = data;
//        this.next = null;
//    }
//
//}
//public class Main {
//
//    public static int count(Node head)
//    {
//        Node temp = head;
//        int count = 0;
//        while(temp!=null)
//        {
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }
//    public static Node convertarr2ll(int[] arr)
//    {
//        Node head = new Node(arr[0], null);
//        Node mover = head;
//        for(int i = 1; i<arr.length; i++)
//        {
//            Node temp = new Node(arr[i], null);
//            mover.next = temp;
//            mover = temp;
//        }
//        return head;
//    }
//    public static void print(Node head)
//    {
//        Node temp = head;
//        while(temp!=null)
//        {
//            System.out.print(temp.data+ "->");
//            temp = temp.next;
//        }
//        System.out.println("End");
//    }
//
//    public static Node insertFirst(Node head, int val)
//    {
//        Node newnode = new Node(val, head);
//        head = newnode;
//        return head;
//    }
//    public static Node insertLast(Node head, int val)
//    {
//        Node temp = head;
//        while(temp.next!=null)
//        {
//            temp = temp.next;
//        }
//        Node newNode = new Node(val, null);
//        temp.next = newNode;
//        return head;
//    }
//    public static Node insertatk(Node head, int k, int val)
//    {
//        if(head == null)
//        {
//            if(k == 1) return new Node(val);
//            else return head;
//        }
//        if(k == 1) return new Node(val, head);
//        Node temp = head;
//        int count = 0;
//        while(temp.next!=null)
//        {
//            count++;
//            if(count == k-1)
//            {
//                Node newNode = new Node(val, temp.next);
//                temp.next = newNode;
//                break;
//            }
//            temp = temp.next;
//        }
//        return head;
//    }
//    public static Node insertbeforeval(Node head, int ele, int val)
//    {
//        if(head == null) return null;
//        if(head.data == val) return new Node(ele, head);
//        Node temp = head;
//        while(temp.next != null)
//        {
//            if(temp.next.data == val)
//            {
//                Node newNode = new Node(ele, temp.next);
//                temp.next = newNode;
//                break;
//            }
//            temp = temp.next;
//        }
//        return head;
//    }
//    public static Node deletehead(Node head)
//    {
//        if(head == null || head.next == null) return null;
//        head = head.next;
//        return head;
//    }
//    public static Node deleteTail(Node head)
//    {
//        if(head == null || head.next == null) return null;
//        Node temp = head;
//        while(temp.next.next != null)
//        {
//            temp = temp.next;
//        }
//        temp.next = null;
//        return head;
//    }
//
//    public static Node Kthelement(Node head, int k)
//    {
//        if(head==null) return null;
//        if(k==1)
//        {
//            head = head.next;
//            return head;
//        }
//        int count = 0;
//        Node temp = head;
//        Node prev = null;
//        while(temp != null)
//        {
//            count++;
//            if(count == k)
//            {
//                prev.next = prev.next.next;
//                break;
//            }
//            prev = temp;
//            temp = temp.next;
//        }
//        return head;
//    }
//    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 6};
//        Node head = convertarr2ll(arr);
//        print(head);
//        System.out.println("The length of the linked list is : "+ count(head));
//        System.out.println("Delete at kth node");
//        Node newNode = Kthelement(head, 3);
//        print(newNode);
//    }
//}
