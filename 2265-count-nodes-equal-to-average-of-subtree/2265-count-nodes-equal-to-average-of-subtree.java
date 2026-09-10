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

    boolean helper(TreeNode root){
        if(root==null) return false;
        Queue<TreeNode> q=new LinkedList<>();
        int start=root.val;
        q.offer(root);
        int sum=0;
        int count=0;
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode x=q.poll();
                sum+=x.val;
                count++;
                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);              
            }
        }  
    
  int result=sum/count;
  if(result==start) return true;
  return false;
    }
       int mom = 0;

    void traverse(TreeNode root) {

        if (root == null)
            return;

        if (helper(root)) {
            mom++;
        }

        traverse(root.left);
        traverse(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
traverse(root);

        return mom;


        
    }
}