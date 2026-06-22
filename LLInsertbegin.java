public class LLInsertbegin {
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
    void insertBeginning(int x) {
        Node n1 = new Node(x);
        if (first == null) {
            first = n1;
            last = n1;
        } else {
            n1.next = first;
            first = n1;
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
        LLInsertbegin l = new LLInsertbegin();
        l.insertBeginning(10);
        l.insertBeginning(20);
        l.insertBeginning(30);
        l.display();
    }
}