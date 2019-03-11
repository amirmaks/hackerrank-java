package thirty_days_of_code.linked_list_deletion;

import java.util.ArrayList;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Solution {
    public static Node removeDublicates(Node head) {
        Node start = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node newHead = null;
        while (start != null) {
            if (!list.contains(start.data)) {
                newHead = insert(newHead, start.data);
                list.add(start.data);
            }
            start = start.next;
        }

        return newHead;
    }

    public static Node insert (Node head, int data) {
        Node p = new Node(data);

        if (head == null) {
            head = p;
        } else if(head.next == null) {
            head.next = p;
        } else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;
        }

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.println(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        Node head = null;
//        int T = scanner.nextInt();
//
//        while (T-- > 0) {
//            int ele = scanner.nextInt();
//            head = insert(head, ele);
//        }

        Node head = null;
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 3);
        head = insert(head, 4);

        head = removeDublicates(head);

        display(head);
    }
}
