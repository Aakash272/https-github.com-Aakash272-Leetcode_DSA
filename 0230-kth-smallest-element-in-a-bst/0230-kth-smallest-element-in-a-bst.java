/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int helper(TreeNode root,int k){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        List<Integer> ap=new ArrayList<>();
        while(!q.isEmpty()){
            int l=q.size();
            for(int i=0;i<l;i++){
          TreeNode x=q.poll();
          ap.add(x.val);
          if(x.left!=null) q.offer(x.left);
          if(x.right!=null) q.offer(x.right);
            }
        }
        Collections.sort(ap);
        int res=ap.get(k-1);
        return res;

    }
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
       return helper(root,k);
    }
}