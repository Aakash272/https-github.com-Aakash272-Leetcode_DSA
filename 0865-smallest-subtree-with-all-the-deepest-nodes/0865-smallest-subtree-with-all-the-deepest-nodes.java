class Solution {

    public int dfs(TreeNode root, int depth) {
        if (root == null) return depth - 1;
        return Math.max(dfs(root.left, depth + 1), dfs(root.right, depth + 1));
    }

    public TreeNode findSubtreeWithAllDeepest(TreeNode root, int currDepth, int maxDepth) {
        if (root == null) return null;

        if (root.left == null && root.right == null) {
            if (currDepth == maxDepth) return root;
            else return null;
        }

        TreeNode left = findSubtreeWithAllDeepest(root.left, currDepth + 1, maxDepth);
        TreeNode right = findSubtreeWithAllDeepest(root.right, currDepth + 1, maxDepth);

        if (left != null && right != null) return root;
        if (left != null) return left;
        return right;
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) return null;

        int maxDepth = dfs(root, 1);
        return findSubtreeWithAllDeepest(root, 1, maxDepth);
    }
}
