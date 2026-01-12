class Solution {

    public int dfs(TreeNode root, TreeNode parent, TreeNode grandparent) {
        if (root == null) return 0;

        int sum = 0;

        if (grandparent != null && grandparent.val % 2 == 0) {
            sum += root.val;
        }

        sum += dfs(root.left, root, parent);
        sum += dfs(root.right, root, parent);

        return sum;
    }

    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root, null, null);
    }
}
