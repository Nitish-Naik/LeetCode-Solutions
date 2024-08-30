public class Linked_List_Cycle_II {
    static class Node{
        int data;
        Node next;
    
        Node(int x){
            data = x;
            next = null;
        }
    }

    static Node head = null;

    public static void create(int data) {
        Node nn= new Node(data);
        if(head == null) {
            head = nn;
            return;
        }

        nn.next = head;
        head = nn;
    }
    public static Node detectCycle() {
        if(head == null || head.next == null) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                }
                return slow;
            }
        }
    }
    return null;
} 
    public static void print() {
        Node temp = head;
        while(temp != null) {
            if(temp.next == null) {
                System.out.print(temp.data);
                return;
            }
            System.out.print(temp.data + "-> " );
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        int []a = {6, 4, 2, 9, 8, 15, 17};

        Solution s = new Solution();
        for(int i: a) {
            s.create(i);
        }
        System.out.println(s.detectCycle());
        s.print();
    }
}
