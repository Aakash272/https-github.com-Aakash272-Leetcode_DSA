class Solution {
    public int[] resultArray(int[] nums) {
    List<Integer> a=new ArrayList<>();
    List<Integer> b=new ArrayList<>();
    int n=nums.length;
    int result[]=new int[n];
   a.add(nums[0]);
   b.add(nums[1]);
    int j=0;
    for(int i=2;i<n;i++){
    if(a.get(a.size()-1) > b.get(b.size()-1)){
        a.add(nums[i]);
  
    }
    else{
        b.add(nums[i]);
  
    }
    }
    for(int i=0;i<a.size();i++){
        result[j++]=a.get(i);
    }
      for(int i=0;i<b.size();i++){
        result[j++]=b.get(i);
    }
    return result;
    }
}