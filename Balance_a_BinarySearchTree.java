import java.util.ArrayList;
import java.util.List;

class Balance_a_BinarySearchTree {
    // Define the TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public TreeNode balanceBST(TreeNode root) {
            List<Integer> nums = new ArrayList<>();
            inorder(root, nums);
            return build(nums, 0, nums.size() - 1);
        }

        private void inorder(TreeNode root, List<Integer> nums) {
            if (root == null) {
                return;
            }
            inorder(root.left, nums);
            nums.add(root.val);
            inorder(root.right, nums);
        }

        // Same as 108. Convert Sorted Array to Binary Search Tree
        private TreeNode build(List<Integer> nums, int l, int r) {
            if (l > r) {
                return null;
            }
            int m = (l + r) / 2;
            return new TreeNode(nums.get(m), build(nums, l, m - 1), build(nums, m + 1, r));
        }
    }

    // Function to print tree in-order (for demonstration purposes)
    static void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        // Create an unbalanced BST for testing
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        // Print original BST
        System.out.println("Original BST (in-order):");
        printInOrder(root);
        System.out.println();

        // Balance the BST
        Solution solution = new Solution();
        TreeNode balancedRoot = solution.balanceBST(root);

        // Print balanced BST
        System.out.println("Balanced BST (in-order):");
        printInOrder(balancedRoot);
    }
}
