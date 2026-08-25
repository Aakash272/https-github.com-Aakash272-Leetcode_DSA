class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            res.add(nums[i]);
        }
for(int i=k;i<=1000;i+=k){
    if(!res.contains(i)){
        return i;
    }
    else{
        continue;
    }
}
return 1;
    }
}