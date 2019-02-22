package thirty_days_of_code.linked_list;

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

    public static Node insert(Node head, int data) {
        Node node = new Node(data);
        if (head != null) {

            if (head.next == null) {
                head.next = node;
            } else {
                Node tail = head.next;

                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = node;
            }
        }
        return head == null ? node : head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.println(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
//        Node head = null;
//        head = insert(head, 2);
//        head = insert(head, 3);
//        head = insert(head, 4);
//        head = insert(head, 1);

        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N  = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }

        display(head);
        sc.close();
    }
}
