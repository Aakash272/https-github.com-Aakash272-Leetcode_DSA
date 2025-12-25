class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
      long result=0;
      int n=happiness.length-1;
        Arrays.sort(happiness);
        int count=1;
        result+=(long)happiness[n];
        if(k==1){
return result;
        }
    int res=1;
        for(int i=happiness.length-2;i>=0;i--){
            long ap=(long)(happiness[i]-res);
            if(ap<0){
       ap=0;
            }
        result=result+ap;
        count++;
            if(count>=k){
                break;
            }
            res++;
        }
return result;
    }
}