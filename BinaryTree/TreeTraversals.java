package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversals extends CreateBinaryTree {

    // Preorder Traversal
    // Complexity: O(n)
    public static void preorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder
    // Complexity: O(n)
    public static void inorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder Traversal
    // Complexity: O(n)
    public static void postorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Level Order Traversal
    // Quere Datastructure is used with iteration
    // Complexity: O(n)
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // Here null represents last element of the level or next line

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println(); // To print in next line for next level
                // queue empty
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        // -1 represents null node
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        Node root = BinaryTree.buildTree(nodes); // static is near to class
        System.out.println("Root of the Tree is: " + root.data);
        System.out.println("Calling pre-order traversal..");
        preorder(root);
        System.out.println("Calling in-order traversal..");
        inorder(root);
        System.out.println("Calling post-order traversal..");
        postorder(root);
        System.out.println("Calling level-order traversal..");
        levelOrder(root);
    }

}
