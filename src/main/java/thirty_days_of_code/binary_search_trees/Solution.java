package thirty_days_of_code.binary_search_trees;
import java.util.Scanner;

class Node {
    Node left, right;
    int data;
    Node(int data) {
        this.data = data;
        left = right = null;
    }

}

public class Solution {

    public static int getHeight(Node root) {
        if (root == null) {
            return -1;
        }
        int l = getHeight(root.left);
        int r = getHeight(root.right);

        return (l > r ? l : r) + 1;
    }

    public static Node insert (Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            if(data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }

        int height = getHeight(root);
        System.out.println(height);

    }

}
