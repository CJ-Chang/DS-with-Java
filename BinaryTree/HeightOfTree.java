package BinaryTree;

public class HeightOfTree extends CreateBinaryTree {

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
        System.out.println("Calculating height of a binary tree...");
        System.out.println(height(root));
    }
}
