package BinaryTree;

public class SubtreeOfAnotherTree extends CreateBinaryTree {

    public class TreeNode {
        int val;
        TreeNode lNode;
        TreeNode rNode;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode lNode, TreeNode rNode) {
            this.val = val;
            this.lNode = lNode;
            this.rNode = rNode;
        }
    }

    // Subtree of another tree
    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (subRoot == null && root == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            return isIdentical(root.lNode, subRoot.lNode) && isIdentical(root.rNode, subRoot.rNode);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        // if(toot.val == subRoot.val) {
        if (isIdentical(root, subRoot)) {
            return true;
        }

        return isSubtree(root.lNode, subRoot) || isSubtree(root.rNode, subRoot);
    }
}
