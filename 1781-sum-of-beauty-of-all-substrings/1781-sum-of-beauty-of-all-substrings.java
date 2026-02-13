class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int result=0;
        for(int i=0;i<n;i++){
           int fre[]= new  int[26];
           for(int j=i;j<n;j++){
            fre[s.charAt(j)-'a']++;
           
            int max=0;
            int min=Integer.MAX_VALUE;
            for(int k=0;k<26;k++){
                if(fre[k]>0){
                    max=Math.max(max,fre[k]);
                    min=Math.min(min,fre[k]);
                }
            }
                result+=(max-min);
           }


        }
    return result;
    }
}