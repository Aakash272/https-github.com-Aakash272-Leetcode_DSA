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
    public List<Integer> check(List<Integer> ap,int key){
        int l=0;
        int r=ap.size()-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ap.get(mid)==key){
                ap.remove(Integer.valueOf(key));
                return ap;
            }
            else if(ap.get(mid)>key){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ap;
    }
    public TreeNode build(List<Integer> ap,int l, int r){
 if(l<=r){
    int mid=l+(r-l)/2;
    TreeNode res=new TreeNode(ap.get(mid));
    res.left=build(ap,l,mid-1);
    res.right=build(ap,mid+1,r);
    return res; 
 }
 else{
    return null;
 }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        List<Integer> ap=new ArrayList<>();
        inorder(root,ap);
        List<Integer> ans=check(ap,key);
        return build(ans,0,ans.size()-1);
    }
}