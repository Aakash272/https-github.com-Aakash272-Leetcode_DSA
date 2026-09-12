class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        HashMap<Integer,List<Integer>> hp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hp.containsKey(nums[i])){
                hp.put(nums[i],new ArrayList<>());
            }
            hp.get(nums[i]).add(i);
        }
       int result=0;
        for(Map.Entry<Integer,List<Integer>> x:hp.entrySet()){
            List<Integer> res=x.getValue();
            int a=x.getKey();
            if(res.size()==3){
                int b=Math.abs(res.get(0)-res.get(1));
                boolean re=false;
             for(int i=1;i<res.size()-1;i++){
               if(b!=Math.abs(res.get(i)-res.get(i+1))){
                re=true;
               }
             }   
             if(!re){
                result++;
             }
            }
        }
        return result;
    }
}