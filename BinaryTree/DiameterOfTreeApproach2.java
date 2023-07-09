package BinaryTree;

public class DiameterOfTreeApproach2 extends CreateBinaryTree {

    // Number of Nodes in the longest path between any 2 nodes
    /*
     * // Diameter of Tree - Approach1 O(N^2)
     * public static int diameter1(Node root) {
     * if (root == null) {
     * return 0;
     * }
     * 
     * int diam1 = height(root.left) + height(root.right) + 1;
     * int diam2 = diameter1(root.left);
     * int diam3 = diameter1(root.right);
     * 
     * return Math.max(diam1, Math.max(diam2, diam3));
     * }
     * 
     * // Deepest node from root to leaf node
     * public static int height(Node root) {
     * if (root == null) {
     * return 0;
     * }
     * 
     * int leftHeight = height(root.left);
     * int rightHeight = height(root.right);
     * return Math.max(leftHeight, rightHeight) + 1;
     * }
     */

    static class TreeInfo {
        int height;
        int diam;

        // constructor
        TreeInfo(int height, int diam) {
            this.height = height;
            this.diam = diam;
        }
    }

    // Diameter of Tree - Approach2 O(N)
    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTI = diameter2(root.left);
        TreeInfo rightTI = diameter2(root.right);

        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;

        int diam1 = leftTI.height + rightTI.height + 1;
        int diam2 = leftTI.diam;
        int diam3 = rightTI.diam;

        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
    }

    public static void main(String[] args) {
        // -1 represents null node
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Calculating diameter of binary tree (approach2)...");
        System.out.println(diameter2(root).diam);
    }
}
