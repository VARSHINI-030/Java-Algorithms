public class LLatposition {
    class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }
    Node first = null;
    void insertBeginning(int x) {
        Node n1 = new Node(x);
        n1.next = first;
        first = n1;
    }
    void insertAtPosition(int x, int pos) {
        Node n1 = new Node(x);
        Node temp = first;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        n1.next = temp.next;
        temp.next = n1;
    }
    void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LLatposition l = new LLatposition();
        l.insertBeginning(30);
        l.insertBeginning(20);
        l.insertBeginning(10);
        l.insertAtPosition(25, 3);
        l.display();
    }
}