package BinaryTree;

public class CountOfNodesOfTree extends CreateBinaryTree {

    // time Complexity: O(n)
    public static int countOfNodes(Node root) {
        if (root == null) {
            // signifies that there is no child
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args) {
        // -1 represents null node
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Calculating count of nodes in the binary tree...");
        System.out.println(countOfNodes(root));
    }
}
