public class LinkedList 
{
    public static class Node 
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addFirst(int data)
    {
        Node nn = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = nn;
        }
        else
        {
            nn.next = head;
            head = nn;
        }
    } 
    public static void addLast(int data)
    {
        Node nn = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = nn;
        }
        else
        {
            tail.next = nn;
            tail = nn;
        }
    }
    public static void addBefore(int data, int target)
    {
        Node current = head;
        Node prev = null;
        Node nn = new Node(data);
        size++;
        if(head != null && head.data == target)
        {
            nn.next = head;
            head = nn;
            return;
        }
        while(current != null && current.data != target)
        {
            prev = current;
            current = current.next;
        }
        // when the linkedlist is empty
        if(current == null)
        {
            System.out.println("key not found");
        }
        // link the nodes
        prev.next = nn;
        nn.next = current;
    }
    
    public static void addAfter(int data, int target)
    {
        Node nn = new Node(data);
        Node current = head;
        Node prev = null;
        size++;
        if(head != null && head.data == target)
        {
            current = head.next;
            head.next = nn;
            nn.next = current;
            return;
        }
        while(current != null && current.data != target)
        {
            prev = current;
            current = current.next;
        }
        nn.next = current;
        prev.next = nn;
    }
    public static void display()
    {
        Node current = head;
        while(current != null) 
        {
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addBefore(10, 4);
        ll.addAfter(123, 1);
        ll.addAfter(200, 123);
        ll.display();
        System.out.println();
        System.out.println(ll.size);
    }    
}