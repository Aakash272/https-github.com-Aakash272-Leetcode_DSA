class Solution {
    public int repeatedNTimes(int[] nums) {
       int n=nums.length;
       int s=n/2;
HashMap<Integer,Integer> ap=new HashMap<>();
for(int i=0;i<n;i++){
    ap.put(nums[i],ap.getOrDefault(nums[i],0)+1);
} 
int result=0;
for(Map.Entry<Integer,Integer> x:ap.entrySet()){
    if(x.getValue()==s){
        result=x.getKey();
    }
}
return result;
    }
}