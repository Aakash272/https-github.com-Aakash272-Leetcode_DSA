class Solution {
    public int minOperations(int[] nums, int[] target) {
        int n=nums.length;
        int m=target.length;
        HashMap<Integer,List<Integer>> ap=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!ap.containsKey(nums[i])){
            ap.put(nums[i],new ArrayList<>());
            }
        ap.get(nums[i]).add(i);
        }
        int count=0;
    for(Map.Entry<Integer,List<Integer>> x:ap.entrySet()){
    int a=x.getKey();
    List<Integer> rp=x.getValue();
    for(int i=0;i<rp.size();i++){
        int s=rp.get(i);
        if(nums[s]!=target[s]){
            count++;
            break;
        }
    }
    }
    return count;
    }
}