class Solution {
    List<List<Integer>> ap;  
 public void helper(boolean []res,int arr[],int n,List<Integer> rp){
if(rp.size()==n){
    if(!ap.contains(rp)){
   ap.add(new ArrayList<>(rp));
    }
    return ;
}
for(int i=0;i<n;i++){
    if(res[i]) continue;
    res[i]=true;
    rp.add(arr[i]);
    helper(res,arr,n,rp);
    rp.remove(rp.size()-1);
    res[i]=false;
}
 }
    public List<List<Integer>> permuteUnique(int[] nums) {
        
             int n=nums.length;
        ap=new ArrayList<>();
        List<Integer> rp=new ArrayList<>();
        boolean res[]=new boolean[n];
        helper(res,nums,n,rp);
return ap;
    }
}