public class Linkedlist {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    Node first = null;
    Node last = null;

    void insert(int x) {
        Node n1 = new Node(x);

        if (first == null) {
            first = n1;
            last = n1;
        } else {
            last.next = n1;
            last = n1;
        }
    }

    void display() {
        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();
    }
}