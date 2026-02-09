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
    public void inorder(TreeNode root,List<Integer> ap){
        if(root==null){
            return;
        }
        inorder(root.left,ap);
        ap.add(root.val);
        inorder(root.right,ap);
    }
    public TreeNode check(List<Integer> ap,int l,int r){
        if(l<=r){
            int mid=l+(r-l)/2;
            TreeNode res=new TreeNode(ap.get(mid));
            res.left=check(ap,l,mid-1);
            res.right=check(ap,mid+1,r);  
              return res; 
                 }
                 else{
                    return null;
                 }

    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> ap=new   ArrayList<>();
        inorder(root,ap);
        return check(ap,0,ap.size()-1);
    }
}