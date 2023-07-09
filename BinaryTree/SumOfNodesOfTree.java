package BinaryTree;

public class SumOfNodesOfTree extends CreateBinaryTree {

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        // -1 represents null node
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Calculating sum of nodes in the binary tree...");
        System.out.println(sumOfNodes(root));
    }

}
