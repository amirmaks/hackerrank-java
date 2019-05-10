package thirty_days_of_code.binary_trees;
import com.sun.deploy.util.SyncAccess;

import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{


    static void levelOrder(Node root){
        if (root == null) {
            return;
        }

        ArrayList<Node> arrayList = new ArrayList<Node>();

        arrayList.add(root);

        while (arrayList.size() > 0) {
            Node tree = arrayList.remove(0);
            System.out.print(tree.data + " ");

            if (tree.left != null) {
                arrayList.add(tree.left);
            }

            if (tree.right != null) {
                arrayList.add(tree.right);
            }
        }

    }

    static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int T=sc.nextInt();
//        Node root=null;
//        while(T-->0){
//            int data=sc.nextInt();
//            root=insert(root,data);
//        }
//        levelOrder(root);

        Node root=null;
        root = insert(root, 3);
        root = insert(root, 5);
        root = insert(root, 4);
        root = insert(root, 7);
        root = insert(root, 2);
        root = insert(root, 1);
        levelOrder(root);
        System.out.println('\n');
        preOrder(root);
    }
}
