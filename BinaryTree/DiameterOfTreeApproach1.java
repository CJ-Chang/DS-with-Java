package BinaryTree;

public class DiameterOfTreeApproach1 extends CreateBinaryTree {

    // Number of Nodes in the longest path between any 2 nodes
    // Diameter of Tree - Approach1 O(N^2)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);

        return Math.max(diam1, Math.max(diam2, diam3));
    }

    // Deepest node from root to leaf node
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        // -1 represents null node
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Calculating diameter of binary tree (approach1)...");
        System.out.println(diameter(root));
    }
}
