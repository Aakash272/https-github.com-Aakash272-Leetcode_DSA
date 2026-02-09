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
            return ;
        }
    inorder(root.left,ap);
    ap.add(root.val);
    inorder(root.right,ap);
    }
    public int check(List<Integer> ap,int k){
       int l=0;
       int r=ap.size()-1;
       while(l<=r){
        int mid=l+(r-l)/2;
        if(mid==k){
            return ap.get(mid-1);
        }
        else if(mid>k){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
       }
       return ap.get(k-1);
    }
    public int kthSmallest(TreeNode root, int k) {
       List<Integer> ap=new ArrayList<>();
       inorder(root,ap); 
       if(ap.size()==1 && k==1){
        return ap.get(0);
       }
       return check(ap,k);
    }
}