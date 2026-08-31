/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int result[]=new int[2];
        if(head==null){
            return new int[]{-1,-1};
        }
        List<Integer> res=new ArrayList<>();
        ListNode curr=head.next;
        ListNode prev=head;
        int size=2;

        while(curr != null && curr.next != null){
         ListNode next=curr.next;
            if(curr.val > prev.val && curr.val >next.val){
                res.add(size);
            }
            else if(curr.val <prev.val && curr.val < next.val){
                res.add(size);

            }
        
            size++;
            prev=prev.next;
            curr=curr.next;
        }
  
     if(res.size()==0){
        return new int[]{-1,-1};
     }
     else if(res.size()==1){
        return new int[]{-1,-1};
     }
  else{
    Collections.sort(res);
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<res.size()-1;i++){
        min=Math.min(min,res.get(i+1)-res.get(i));
    }
    max=Integer.max(max,res.get(res.size()-1)-res.get(0));
    return new int []{min,max};
  }
   

    }
}