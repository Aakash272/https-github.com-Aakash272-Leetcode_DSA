class Solution {
    public int firstMissingPositive(int[] nums) {
    int n=nums.length;
HashSet<Integer> ap=new HashSet<>();
for(int i=0;i<n;i++){
    ap.add(nums[i]);
}
if(nums[0]==1 && n==1){
    return 2;
}
int result=0;
for(int i=1;i<=n;i++){
 if(!ap.contains(i)){
result=i;
break;
 }
}
if(result==0){
    result=n+1;
}
   return result;
    }
}