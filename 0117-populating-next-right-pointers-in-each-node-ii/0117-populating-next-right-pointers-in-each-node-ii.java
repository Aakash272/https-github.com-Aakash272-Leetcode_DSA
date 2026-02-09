/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node check(Node root){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int l=q.size();
          Node dummy=new Node();
          Node curr=dummy;
            for(int i=0;i<l;i++){
                Node x=q.poll();
                curr.next=x;
                curr=curr.next;
                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);
            }
         curr.next=null;
        }
        return root;
    }
    public Node connect(Node root) {
      if(root==null){
        return root;
      }
      return check(root);
    }
}