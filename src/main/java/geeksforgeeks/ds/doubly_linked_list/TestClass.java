package geeksforgeeks.ds.doubly_linked_list;

public class TestClass {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {

    }

    public void push(int new_data)
    {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        new_Node.prev = null;

        if (head != null) {
            head.prev = new_Node;
        }

        head = new_Node;
    }

    public void insertAfter(Node prev_Node, int new_data)
    {
        if(prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;

        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }

    }


}


