class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
     boolean res=false;
        int n=capacity.length;
        int min=Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<n;i++){
           if(capacity[i]>=itemSize && (result>capacity[i] || result==0)){
               res=true;
                 min=i;
               result=capacity[i];     
           } 
        }
        if(!res) return -1;
        return min;
    }
}