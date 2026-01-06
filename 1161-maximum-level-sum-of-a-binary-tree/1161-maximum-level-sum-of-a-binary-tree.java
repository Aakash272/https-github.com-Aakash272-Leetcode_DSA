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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int max=Integer.MIN_VALUE;
        int result=0;
        int j=1;
        while(!q.isEmpty()){
            int level=q.size();
            int sum=0;
            for(int i=0;i<level;i++){
                TreeNode x=q.poll();
                sum+=x.val;
            if(x.left!=null) q.offer(x.left);
            if(x.right!=null) q.offer(x.right);
            }
            if(sum>max){
                max=sum;
                result=j;
            }
            j++;
        }
        return result;
    }
}