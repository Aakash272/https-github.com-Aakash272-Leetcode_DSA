/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    List<TreeNode> ap=new ArrayList<>();
    List<TreeNode> rp=new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,ap);
        dfs(root,q,rp);
int i=0;
TreeNode ans=new TreeNode(0);
while(i<ap.size() && i<rp.size()){
   if(ap.get(i)==rp.get(i)) ans=ap.get(i);
   else break;

   i++;
}
return ans;
    
    }
   static boolean dfs(TreeNode root,TreeNode p,List<TreeNode> path){
        if(root==null) return false;
       path.add(root);
        if(root==p) return true;

        if(dfs(root.left,p,path)|| dfs(root.right,p,path)){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
}