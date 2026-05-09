class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        int total = 1 << n;
        
        for (int i = 0; i < total; i++) {
            List<Integer> subset = new ArrayList<>();
            
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            
            set.add(subset);
        }
        
        return new ArrayList<>(set);
    }
}