package LinkedList;

public class reverseLL {
    static Node head;
    static void add(int num) {
        Node newnode = new Node(num);

        if (head == null) {
            head = newnode;

        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }


        static void print () {
            Node temp = head;
            System.out.print(temp.data + "->");
            while (temp.next != null) {
                temp = temp.next;
                System.out.print(temp.data + "->");
            }

        }
        static void reverse () {
            Node temp = head;
            Node prev = null;
            while(temp != null && temp.next != null) {
                Node front = temp.next;
                front.next = temp;
                prev = temp;
                temp = front;
            }
        }
        static Node recursive (Node head){
            if (head == null || head.next == null) {
                return head;
            }
            Node newnode = recursive(head.next);
            Node front = head.next;
            front.next = head;
            head.next = null;
            return newnode;

    }
    public static void main(String[] args) {
        reverseLL ans = new reverseLL();
        ans.add(3);
        ans.add(4);
        ans.add(5);
        ans.add(6);
        print();
        reverse();
        print();

    }
}
 class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
